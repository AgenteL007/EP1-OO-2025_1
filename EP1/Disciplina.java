import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private ArrayList<String> preRequisitos;
    private Turma turma;

    public Disciplina() {
        this.nome = "";
        this.codigo = "";
        this.cargaHoraria = 0;
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
