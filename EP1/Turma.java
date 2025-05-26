public class Turma {
    private String professor; // Nome do professor da turma
    private int semestre; // De qual semestre a turma é
    private boolean avaliacao; // Se a forma de avaliação tem peso ou não
    private boolean formato;// Se é presencial ou remoto
    private String sala; // Sala da turma
    private String horario; // Horário da aula
    private int capacidade; // Capacidade máxima de alunos

    public Turma() {
        this.professor = "";
        this.semestre = 0;
        this.avaliacao = false; // FALSE é (p1 + p2 + p3 + l + s) / 5 e TRUE é (p1 + p2 * 2 + p3 * 3 + l + s) /
                                // 8
        this.formato = true; // TRUE é porque tem sala
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

    public int getSemestre() {
        return semestre;
    }

    public void setAvaliacao(boolean avaliacao) {
        this.avaliacao = avaliacao;
    }

    public boolean getAvaliacao() {
        return avaliacao;
    }

    public void setFormato(boolean formato) {
        this.formato = formato;
    }

    public boolean getFormato() {
        return formato;
    }

    public void setSala(String sala) {
        if (formato != true) { // Verifica se o formato é presencial ou remoto
            this.sala = "Não tem sala";
        } else {
            this.sala = sala;
        }
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