package com.mateusir.movieApp.Repository;

import com.mateusir.movieApp.Models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SerieRepository  extends JpaRepository<Serie, Long> {

 Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);

}
