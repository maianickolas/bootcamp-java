package edu.nickolas.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Kotlin");
        curso2.setDescricao("Descrição do curso de Kotlin");
        curso2.setCargaHoraria(75);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição Mentoria de Java");
        mentoria1.setDataMentoria(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devNickolas = new Dev();
        devNickolas.setNome("Nickolas");
        devNickolas.inscreverBootcamp(bootcamp);
        System.out.println("----\t----");
        System.out.println("Conteúdos inscritos Nickolas: " + devNickolas.getConteudosInscritos());
        devNickolas.progredir();
        devNickolas.progredir();
        System.out.println("Conteúdos inscritos Nickolas: " + devNickolas.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Nickolas: " + devNickolas.getConteudosConcluidos());
        System.out.println("XP: " + devNickolas.calcularTotalXp());
        System.out.println("----\t----");

        Dev devJorge = new Dev();
        devJorge.setNome("Jorge");
        devJorge.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Jorge: " + devJorge.getConteudosInscritos());
        devJorge.progredir();
        devJorge.progredir();
        devJorge.progredir();
        System.out.println("Conteúdos inscritos Jorge: " + devJorge.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Jorge: " + devJorge.getConteudosConcluidos());
        System.out.println("XP: " + devJorge.calcularTotalXp());
        System.out.println("----\t----");
    }
}
