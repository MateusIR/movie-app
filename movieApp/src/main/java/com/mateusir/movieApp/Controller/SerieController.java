package com.mateusir.movieApp.Controller;

import com.mateusir.movieApp.DTO.EpisodioDto;
import com.mateusir.movieApp.DTO.SerieDTO;
import com.mateusir.movieApp.Models.Serie;
import com.mateusir.movieApp.Repository.SerieRepository;
import com.mateusir.movieApp.Service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SerieController {

    @Autowired
    private SerieService SerieService;
    @Autowired
    private SerieService serieService;

    @RequestMapping("/series")

    @GetMapping
    public List<SerieDTO> obterSeries() {
        return serieService.getSeries();
    }

    @GetMapping("/inicio")
    public String obterInicio() {
        return "opa, bom dia";

    }

    @GetMapping("/top5")
    public List<SerieDTO> obtertop5Series() {
        return serieService.getSeriesT5();
    }

    @GetMapping("/lancamentos")
    public List<SerieDTO> obterLancamentos() {
   return SerieService.obterLancamentos();
}
    @GetMapping("/{id}")
    public SerieDTO obterinfoSerie(@PathVariable Long id) {
        return SerieService.obterid(id);
    }
    @GetMapping("/{id}/temporadas/todas")
    public List<EpisodioDto> obterTodasTemporadas(@PathVariable Long id) {
        return SerieService.obterTemporadas(id);
    }
    @GetMapping("/{id}/temporadas/{numero}")
    public List<EpisodioDto> obterTemporadaNum(@PathVariable Long id, @PathVariable Integer numero) {
        return SerieService.obterTemporadaNum(id, numero);
    }

}
