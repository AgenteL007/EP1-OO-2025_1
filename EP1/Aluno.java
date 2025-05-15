import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    private String nome; // Nome do aluno
    private int matricula; // Matrícula do aluno
    private String curso; // Curso que o aluno faz
    private ArrayList<String> presencas; // Lista dos dias que o aluno foi ou faltou
    private ArrayList<String> disciplinasCursadas;// Lista das disciplinas cursadas pelo aluno

    public Aluno() {
        this.nome = "";
        this.matricula = 0;
        this.curso = "";
        this.disciplinasCursadas = new ArrayList<>();
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
}