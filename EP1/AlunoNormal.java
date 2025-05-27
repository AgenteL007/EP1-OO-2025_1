public class AlunoNormal extends Aluno {
    private float p1; // Prova 1
    private float p2; // Prova 2
    private float p3; // Prova 3
    private float l; // Lista de Exercícios
    private float s; // Seminário

    public AlunoNormal() {
        this.p1 = 0;
        this.p2 = 0;
        this.p3 = 0;
        this.l = 0;
        this.s = 0;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP1() {
        return p1;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public float getP2() {
        return p2;
    }

    public void setP3(float p3) {
        this.p3 = p3;
    }

    public float getP3() {
        return p3;
    }

    public void setL(float l) {
        this.l = l;
    }

    public float getL() {
        return l;
    }

    public void setS(float s) {
        this.s = s;
    }

    public float getS() {
        return s;
    }

    public void verificarAprovacaoSemPeso(float p1, float p2, float p3, float l, float s) {
        float mediaFinal = (p1 + p2 + p3 + l + s) / 5;

        if (mediaFinal < 5) {
            System.out.println("Aluno reprovado por nota.");
        } else {
            System.out.println("Aluno com nota para passar.");
        }
    }

    public void verificarAprovacaoComPeso(float p1, float p2, float p3, float l, float s) {
        float mediaFinal = (p1 + p2 * 2 + p3 * 3 + l * 3 + s) / 8;

        if (mediaFinal < 5) {
            System.out.println("Aluno reprovado por nota.");
        } else {
            System.out.println("Aluno com nota para passar.");
        }
    }
}