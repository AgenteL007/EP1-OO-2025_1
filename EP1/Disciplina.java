import java.util.ArrayList;

public class Disciplina {
    private String nome; // Nome da disciplina
    private String codigo; // Código da disciplina
    private int cargaHoraria; // Carga horária da disciplina
    private ArrayList<String> preRequisitos; // Os pré-requisitos para cursar a disciplina
    private Turma turma; // As turmas que cada disciplina tem

    public Disciplina() {
        this.nome = "";
        this.codigo = "";
        this.cargaHoraria = 0;
        this.preRequisitos = new ArrayList<>();
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

    public void setPreRequisitos(ArrayList<String> preRequisitos) {

    }

    public ArrayList<String> getPreRequisito() {
        return preRequisitos;
    }

    public Turma geTurma() {
        return turma;
    }
}
