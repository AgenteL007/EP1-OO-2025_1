import java.util.ArrayList;

public class AlunoEspecial extends Aluno {
    private ArrayList<String> disciplinasCursando; // Quais disciplinas estão sendo cursadas

    public AlunoEspecial() {
        this.disciplinasCursando = new ArrayList<>(2);
    }
}