package com.mateusir.movieApp.Service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
