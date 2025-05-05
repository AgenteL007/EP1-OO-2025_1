import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private ArrayList<String> presencas;
    private ArrayList<String> disciplinasCursadas;

    public Aluno() {
        this.nome = "";
        this.matricula = 0;
        this.curso = "";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void registrarPresencas() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número de aulas ministradas: ");
        int aulas = sc.nextInt();

        for (int i = 0; i < aulas; i++) {
            System.out.print("Aula " + (i + 1) + ": ");
            String entrada = sc.nextLine();
            presencas.add(entrada);
        }

        sc.close();
    }

    public void exibirPresencas() {
        for (int i = 0; i < presencas.size(); i++) {
            System.out.println("Aula " + (i + 1) + ": " + presencas.get(i));
        }
    }

    public void registrarDisciplinasCursadas() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número de disciplinas que serão adicionadas: ");
        int disciplinas = sc.nextInt();

        System.out.println("Agora digite todas as disciplinas cursadas com sucesso pelo aluno:");

        for (int i = 0; i < disciplinas; i++) {
            String entrada = sc.nextLine();
            disciplinasCursadas.add(entrada);
        }

        sc.close();
    }

    public void exibirDisciplinasCursadas() {
        for (String disciplinaCursada : disciplinasCursadas) {
            System.out.println(disciplinaCursada);
        }
    }
}