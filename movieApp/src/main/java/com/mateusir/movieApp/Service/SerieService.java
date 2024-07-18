package com.mateusir.movieApp.Service;

import com.mateusir.movieApp.DTO.EpisodioDto;
import com.mateusir.movieApp.DTO.SerieDTO;
import com.mateusir.movieApp.Models.Serie;
import com.mateusir.movieApp.Repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SerieService {

    public List<EpisodioDto> obterTemporadas(Long id){
        Optional<Serie> serie = serieRepository.findById(id);
        if (serie.isPresent()) {
            Serie s = serie.get();
            return s.getEpisodios().stream().map(episodio -> new EpisodioDto(episodio.getTemporada(),episodio.getNumero(),episodio.getTitulo())).collect(Collectors.toList());
        }
        return null;
    }

    @Autowired
    private SerieRepository serieRepository;
    public List<SerieDTO> getSeries() {
        return converter(serieRepository.findAll());
    }

    public List<SerieDTO> getSeriesT5() {
        return converter(SerieRepository. findTop5ByOrderByAvaliacaoDesc());
    }
    private List<SerieDTO> converter(List<Serie> serieList) {
        return serieList.stream()
                .map(s -> new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(), s.getAvaliacao(), s.getGenero(), s.getAtores(), s.getPoster(), s.getDescricao()))
                .collect(Collectors.toList());
    }

    public List<SerieDTO> obterLancamentos() {
        return converter(serieRepository.lancamentosMaisRecentes());
    }

    public SerieDTO obterid(Long id) {
       Optional<Serie> serie = serieRepository.findById(id);
       if (serie.isPresent()) {
           Serie s = serie.get();
           return new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(), s.getAvaliacao(), s.getGenero(), s.getAtores(), s.getPoster(), s.getDescricao());
       }
        return null;
        }

    public List<EpisodioDto> obterTemporadaNum(Long id, Integer numero) {
        return serieRepository.obterEpisodiosPorTemporada(id, numero).stream().map(episodio -> new EpisodioDto(episodio.getTemporada(),episodio.getNumero(),episodio.getTitulo())).collect(Collectors.toList());
    }
}

