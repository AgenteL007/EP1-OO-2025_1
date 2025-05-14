<<<<<<< HEAD
import java.util.ArrayList;

public class AlunoNormal extends Aluno {
    private int p1; // Prova 1
    private int p2; // Prova 2
    private int p3; // Prova 3
    private int l; // Lista de Exercícios
    private int s; // Seminário
    private ArrayList<String> disciplinasCursando; // Quais disciplinas estão sendo cursadas
=======
public class AlunoNormal extends Aluno {
    private int p1;
    private int p2;
    private int p3;
    private int l;
    private int s;
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161

    public AlunoNormal() {
        this.p1 = 0;
        this.p2 = 0;
        this.p3 = 0;
        this.l = 0;
        this.s = 0;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP1() {
        return p1;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP2() {
        return p2;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public int getP3() {
        return p3;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getL() {
        return l;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getS() {
        return s;
    }
}