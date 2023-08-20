package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mentoria mentoria = (Mentoria) o;
        return Objects.equals(data, mentoria.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), data);
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
