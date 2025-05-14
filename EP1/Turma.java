public class Turma {
<<<<<<< HEAD
    private String professor; // Nome do professor da turma
    private int semestre; // De qual semestre a turma é
    private String avaliacao; // Forma de avaliação
    private boolean formato;// Se é presencial ou remoto
    private String sala; // Sala da turma
    private String horario; // Horário da aula
    private int capacidade; // Capacidade máxima de alunos
=======
    private String professor;
    private int semestre;
    private String avaliacao;
    private String formato;
    private String sala;
    private String horario;
    private int capacidade;
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161

    public Turma() {
        this.professor = "";
        this.semestre = 0;
        this.avaliacao = "";
<<<<<<< HEAD
        this.formato = true; // TRUE é porque tem sala
=======
        this.formato = "";
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161
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

<<<<<<< HEAD
    public void setFormato(boolean formato) {
        this.formato = formato;
    }

    public boolean getFormato() {
=======
    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161
        return formato;
    }

    public void setSala(String sala) {
<<<<<<< HEAD
        if (formato != true) { // Verifica se o formato é presencial ou remoto
            this.sala = "Não tem sala";
        } else {
            this.sala = sala;
        }
=======
        this.sala = sala;
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161
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