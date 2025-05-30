import java.util.Scanner;
import java.util.ArrayList;

public class Disciplina {
    private String nome; // Nome da disciplina
    private String codigo; // Código da disciplina
    private int cargaHoraria; // Carga horária da disciplina
    private ArrayList<String> preRequisitosNecessarios; // Os pré-requisitos para cursar a disciplina
    private Turma turma; // As turmas que cada disciplina tem

    public Disciplina() {
        this.nome = "";
        this.codigo = "";
        this.cargaHoraria = 0;
        this.preRequisitosNecessarios = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setPreRequisitos(ArrayList<String> preRequisitosNecessarios) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de pré-requisitos que serão adicionadas: ");
        int preRequisitos = sc.nextInt();

        System.out.println("Agora digite todos os pré-requisitos necessárias para se matricula na disciplina");

        for (int i = 0; i < preRequisitos; i++) {
            String entrada = sc.nextLine();
            preRequisitosNecessarios.add(entrada);
        }

        sc.close(); // Fecha a entrada de leitura do teclado
    }

    public ArrayList<String> getPreRequisitos() {
        return preRequisitosNecessarios;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }
}
