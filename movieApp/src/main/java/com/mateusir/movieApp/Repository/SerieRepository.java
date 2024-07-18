package com.mateusir.movieApp.Repository;

import com.mateusir.movieApp.Models.Episodio;
import com.mateusir.movieApp.Models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SerieRepository  extends JpaRepository<Serie, Long> {

    static List<Serie> findTop5ByOrderByAvaliacaoDesc() {
        return null;
    }

    @Query("SELECT s FROM Serie s " +
            "JOIN s.episodios e " +
            "GROUP BY s " +
            "ORDER BY MAX(e.dataLancamento) DESC LIMIT 5")
    List<Serie> lancamentosMaisRecentes();


    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);

 List<Serie> findByGenero(String categoria);

    @Query("SELECT e FROM Serie s JOIN s.episodios e WHERE s.id = :id AND e.temporada = :numero")
    List<Episodio> obterEpisodiosPorTemporada(Long id, Integer numero);



}
