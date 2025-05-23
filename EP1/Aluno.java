import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;

public class Aluno implements Serializable {
    private String nome; // Nome do aluno
    private int matricula; // Matrícula do aluno
    private String curso; // Curso que o aluno faz
    private boolean trancamento; // Se o semestre está ou não trancado
    private ArrayList<String> presencas; // Lista dos dias que o aluno foi ou faltou
    private ArrayList<String> disciplinasCursadas; // Lista das disciplinas cursadas pelo aluno
    protected ArrayList<String> disciplinasCursando; // Quais disciplinas estão sendo cursadas

    public Aluno() {
        this.nome = "";
        this.matricula = 0;
        this.curso = "";
        this.trancamento = false; // FALSE é porque o semestre não está trancado
        this.disciplinasCursadas = new ArrayList<>();
        this.disciplinasCursando = new ArrayList<>();
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

    public void setTrancamento(boolean trancamento) {
        this.trancamento = trancamento;
    }

    public boolean getTrancamento() {
        return trancamento;
    }

    public void registrarPresencas() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de aulas ministradas: "); // Pega o número total de aulas
        int aulas = sc.nextInt();

        for (int i = 0; i < aulas; i++) { // Cria uma lista da presença do aluno até aquela aula ministrada
            System.out.print("Aula " + (i + 1) + ": ");
            String entrada = sc.nextLine();
            presencas.add(entrada);
        }

        sc.close(); // Fecha a entrada de leitura do teclado
    }

    public void exibirPresencas() { // Exibe a presença do aluno
        for (int i = 0; i < presencas.size(); i++) {
            System.out.println("Aula " + (i + 1) + ": " + presencas.get(i));
        }
    }

    public void registrarDisciplinasCursadas() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de disciplinas que serão adicionadas: ");
        int disciplinas = sc.nextInt();

        System.out.println("Agora digite todas as disciplinas cursadas com sucesso pelo aluno:");

        for (int i = 0; i < disciplinas; i++) {
            String entrada = sc.nextLine();
            disciplinasCursadas.add(entrada);
        }

        sc.close(); // Fecha a entrada de leitura do teclado
    }

    public void exibirDisciplinasCursadas() { // Exibe as disciplinas cursadas com sucesso
        for (String disciplinaCursada : disciplinasCursadas) {
            System.out.println(disciplinaCursada);
        }
    }

    public void registrarDisciplinasCursando() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de disciplinas que serão adicionadas: ");
        int disciplinas = sc.nextInt();

        System.out.println("Agora digite todas as disciplinas que serão cursadas no semestre atual:");

        for (int i = 0; i < disciplinas; i++) {
            String entrada = sc.nextLine();
            disciplinasCursando.add(entrada);
        }

        sc.close(); // Fecha a entrada de leitura do teclado
    }

    public void exibirDiscipplinasCursando() {
        for (String disciplinaCursando : disciplinasCursando) {
            System.out.println(disciplinaCursando);
        }
    }
}