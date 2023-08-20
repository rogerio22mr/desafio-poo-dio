package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria {

    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                '}';
    }
}
