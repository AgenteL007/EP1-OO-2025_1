import java.util.ArrayList;

public class Disciplina {
<<<<<<< HEAD
    private String nome; // Nome da disciplina
    private String codigo; // Código da disciplina
    private int cargaHoraria; // Carga horária da disciplina
    private ArrayList<String> preRequisitos; // Os pré-requisitos para cursar a disciplina
    private Turma turma; // As turmas que cada disciplina tem
=======
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private ArrayList<String> preRequisitos;
    private Turma turma;
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161

    public Disciplina() {
        this.nome = "";
        this.codigo = "";
        this.cargaHoraria = 0;
<<<<<<< HEAD
        this.preRequisitos = new ArrayList<>();
=======
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161
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
<<<<<<< HEAD
}
=======
}
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161
