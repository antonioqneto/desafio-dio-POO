import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso sobre Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso PHP");
        curso2.setDescricao("Curso sobre PHP");
        curso2.setCargaHoraria(10);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria sobre Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT Quality Assurance #1");
        bootcamp.setDescricao("Conheça já o Bootcamp GFT Quality Assurance #1: um programa feito para você que planeja desenvolver suas habilidades em QA.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Dev1");
        dev1.inscreverBootcamp(bootcamp);
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP::" + dev1.calcularTotalXp());

        System.out.println("--------------");

        Dev dev2 = new Dev();
        dev2.setNome("Dev2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP::" + dev2.calcularTotalXp());
    }
}
