package edu.nickolas.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    LocalDate dataMentoria;

    public Mentoria() {

    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataMentoria=" + dataMentoria +
                '}';
    }
}
