import br.com.dio.desafio.dominio.Curso;

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

        System.out.println(curso1);
        System.out.println(curso2);


    }
}
