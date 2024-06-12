package com.mateusir.movieApp.Models;

public enum Categoria {
    ACAO("Action"),
    CRIME("Crime"),
    DRAMA("Drama"),
    COMEDIA("Comedy"),
    FANTASIA("Fantasy"),
    MISTERIO("Mystery"),
    SCI_FI("Sci-Fi"),
    ROMANCE("Romance");

    private String categoriaOmdb;
    Categoria(String categoriaOmdb) {}


    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

}

