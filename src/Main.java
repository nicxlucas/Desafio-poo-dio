import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("descrição curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Js");
        curso2.setDescricao("descrição curso de js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1= new Mentoria();
        mentoria1.setTitulo("Curso de Java");
        mentoria1.setDescricao("descrição curso de java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp java developer");
        bootcamp.setDescricao("Descrição java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: "+ devLucas.getConteudoInscritos());
        devLucas.progredir();
        devLucas.progredir();

        System.out.println("--");
        System.out.println("Conteudos Inscritos: "+ devLucas.getConteudoInscritos());
        System.out.println("Conteudos Concluídos: "+ devLucas.getConteudoConcluidos());
        System.out.println("XP: "+ devLucas.calcularTotalXp());

        System.out.println("======================================");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: "+ devLucas.getConteudoInscritos());
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos: "+ devLucas.getConteudoInscritos());
        System.out.println("Conteudos Concluídos: "+ devJoao.getConteudoConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());

    }
}