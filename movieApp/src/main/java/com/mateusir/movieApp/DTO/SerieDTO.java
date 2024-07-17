package com.mateusir.movieApp.DTO;

import com.mateusir.movieApp.Models.Categoria;


public record SerieDTO(Long titulo,
                       String totalTemporadas,
                       Integer avaliacao,
                       Double descricao,
                       Categoria genero,
                       String atores,
                       String poster,
                       String id
) {
}
