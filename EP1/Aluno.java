import java.util.ArrayList;
import java.util.Scanner;
<<<<<<< HEAD

public class Aluno {
    private String nome; // Nome do aluno
    private int matricula; // Matrícula do aluno
    private String curso; // Curso que o aluno faz
    private ArrayList<String> presencas; // Lista dos dias que o aluno foi ou faltou
    private ArrayList<String> disciplinasCursadas;// Lista das disciplinas cursadas pelo aluno
=======
import java.util.Locale;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private ArrayList<String> presencas;
    private ArrayList<String> disciplinasCursadas;
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161

    public Aluno() {
        this.nome = "";
        this.matricula = 0;
        this.curso = "";
<<<<<<< HEAD
        this.disciplinasCursadas = new ArrayList<>();
=======
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161
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
<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de aulas ministradas: "); // Pega o número total de aulas
        int aulas = sc.nextInt();

        for (int i = 0; i < aulas; i++) { // Cria uma lista da presença do aluno até aquela aula ministrada
=======
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número de aulas ministradas: ");
        int aulas = sc.nextInt();

        for (int i = 0; i < aulas; i++) {
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161
            System.out.print("Aula " + (i + 1) + ": ");
            String entrada = sc.nextLine();
            presencas.add(entrada);
        }

<<<<<<< HEAD
        sc.close(); // Fecha a entrada de leitura do teclado
    }

    public void exibirPresencas() { // Exibe a presença do aluno
=======
        sc.close();
    }

    public void exibirPresencas() {
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161
        for (int i = 0; i < presencas.size(); i++) {
            System.out.println("Aula " + (i + 1) + ": " + presencas.get(i));
        }
    }

<<<<<<< HEAD
    public void registrarDisciplinasCursadas() { // Cria uma lista com as disciplinas cursadas com sucesso
        Scanner sc = new Scanner(System.in);
=======
    public void registrarDisciplinasCursadas() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161

        System.out.print("Digite o número de disciplinas que serão adicionadas: ");
        int disciplinas = sc.nextInt();

        System.out.println("Agora digite todas as disciplinas cursadas com sucesso pelo aluno:");

        for (int i = 0; i < disciplinas; i++) {
            String entrada = sc.nextLine();
            disciplinasCursadas.add(entrada);
        }

<<<<<<< HEAD
        sc.close(); // Fecha a entrada de leitura do teclado
    }

    public void exibirDisciplinasCursadas() { // Exibe as disciplinas cursadas com sucesso
=======
        sc.close();
    }

    public void exibirDisciplinasCursadas() {
>>>>>>> 1a5e93b43467f059340589327d39a9c6989f1161
        for (String disciplinaCursada : disciplinasCursadas) {
            System.out.println(disciplinaCursada);
        }
    }
}