public class Turma {
    private String professor;
    private int semestre;
    private String avaliacao;
    private String formato;
    private String sala;
    private String horario;
    private int capacidade;

    public Turma() {
        this.professor = "";
        this.semestre = 0;
        this.avaliacao = "";
        this.formato = "";
        this.sala = "";
        this.horario = "";
        this.capacidade = 0;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getProfessor() {
        return professor;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int setSemestre() {
        return semestre;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getSala() {
        return sala;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }
}