package com.mateusir.movieApp.Repository;

import com.mateusir.movieApp.Models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SerieRepository  extends JpaRepository<Serie, Long> {

    static List<Serie> findTop5ByOrderByAvaliacaoDesc() {
        return null;
    }


    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);

 List<Serie> findByGenero(String categoria);
}
