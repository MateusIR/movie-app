package com.mateusir.movieApp.Models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.mateusir.movieApp.Service.ConsultaChatGPT;

import java.util.Optional;

public class Serie {
    private String titulo;
    private Integer totalTemporadas;
    private Double  avaliacao ;
    private String  descricao;
    private Categoria genero;
    private String atores;
    private String poster;

    public Serie(DadosSerie dadosSerie){
        this.titulo = dadosSerie.titulo();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.avaliacao = Optional.of(Double.valueOf(dadosSerie.avaliacao())).orElse((double) 0);
        this.descricao = ConsultaChatGPT.obterTraducao(dadosSerie.descricao()).trim();;
        this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
        this.atores = dadosSerie.atores();
        this.poster = dadosSerie.poster();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(Integer totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getGenero() {
        return genero;
    }

    public void setGenero(Categoria genero) {
        this.genero = genero;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", totalTemporadas=" + totalTemporadas +
                ", avaliacao=" + avaliacao +
                ", descricao='" + descricao + '\'' +
                ", genero=" + genero +
                ", atores='" + atores + '\'' +
                ", poster='" + poster + '\'' ;
    }
}


