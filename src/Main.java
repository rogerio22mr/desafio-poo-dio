import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("curso java", "descricao curso java", 8);
        Curso curso2 = new Curso("curso js", "descricao curso js", 4);

        Mentoria mentoria1 = new Mentoria("mentoria de java", "descricao mentoria java", LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRogerio = new Dev("Rogerio");
        devRogerio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Rogerio: " + devRogerio.getConteudosInscritos());
        devRogerio.progredir();
        devRogerio.progredir();
        System.out.println("*");
        System.out.println("Conteudos Inscritos Rogerio: " + devRogerio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rogerio: " + devRogerio.getConteudosConcluidos());
        System.out.println("XP: " + devRogerio.calcularTotalXp());

        System.out.println("\n------------------------------\n");

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("*");
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

    }
}
