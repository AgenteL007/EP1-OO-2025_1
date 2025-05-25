import java.util.Scanner;
import java.util.ArrayList;

public class Aluno {
    protected String nome; // Nome do aluno
    protected int matricula; // Matrícula do aluno
    protected String curso; // Curso que o aluno faz
    protected boolean trancamento; // Se o semestre está ou não trancado
    protected ArrayList<String> presencas; // Lista dos dias que o aluno foi ou faltou
    protected ArrayList<String> disciplinasCursadas; // Lista das disciplinas cursadas pelo aluno
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

    public void setPresencas(ArrayList<String> presencas) {
        Scanner sc = new Scanner(System.in);
        int verificador = 0;

        System.out.print("Digite o número de aulas ministradas: "); // Pega o número total de aulas
        while (verificador == 0)
            if (sc.hasNext()) { // Verifica se a próxima entrada é um Inteiro
                int aulas = sc.nextInt();
                sc.nextLine(); // Limpa o buffer

                for (int i = 0; i < aulas; i++) { // Cria uma lista da presença do aluno até aquela aula ministrada
                    System.out.print("Aula " + (i + 1) + ": ");
                    String entrada = sc.nextLine();
                    presencas.add(entrada);
                }

                verificador = 1;

                sc.close(); // Fecha a entrada de leitura do teclado
            } else { // Caso não seja digitado um Inteiro
                System.out.println();
                System.out.println("Entrada inválida. Digite apenas números.");
                sc.nextLine();
            }
    }

    public ArrayList<String> getPresencas() {
        return presencas;
    }

    public void setDisciplinasCursadas(ArrayList<String> disciplinasCursadas) {
        Scanner sc = new Scanner(System.in);
        int verificador = 0;

        System.out.print("Digite o número de disciplinas que serão adicionadas: ");
        while (verificador == 0)
            if (sc.hasNext()) { // Verifica se a próxima entrada é um Inteiro
                int disciplinas = sc.nextInt();
                sc.nextLine(); // Limpa o buffer

                System.out.println("Agora digite todas as disciplinas cursadas com sucesso pelo aluno:");

                for (int i = 0; i < disciplinas; i++) {
                    String entrada = sc.nextLine();
                    disciplinasCursadas.add(entrada);
                }

                verificador = 1;

                sc.close(); // Fecha a entrada de leitura do teclado
            } else { // Caso não seja digitado um Inteiro
                System.out.println();
                System.out.println("Entrada inválida. Digite apenas números.");
                sc.nextLine();
            }
    }

    public ArrayList<String> getDisciplinasCursadas() {
        return disciplinasCursadas;
    }

    public void setDisciplinasCursando(ArrayList<String> disciplinasCursando) {
        Scanner sc = new Scanner(System.in);
        int verificador = 0;

        System.out.print("Digite o número de disciplinas que serão adicionadas: ");
        while (verificador == 0)
            if (sc.hasNext()) { // Verifica se a próxima entrada é um Inteiro
                int disciplinas = sc.nextInt();
                sc.nextLine(); // Limpa o buffer

                System.out.println("Agora digite todas as disciplinas que serão cursadas no semestre atual:");

                for (int i = 0; i < disciplinas; i++) {
                    String entrada = sc.nextLine();
                    disciplinasCursando.add(entrada);
                }

                verificador = 1;

                sc.close(); // Fecha a entrada de leitura do teclado
            } else { // Caso não seja digitado um Inteiro
                System.out.println();
                System.out.println("Entrada inválida. Digite apenas números.");
                sc.nextLine();
            }
    }

    public ArrayList<String> getDisciplinasCursando() {
        return disciplinasCursando;
    }

    public void exibirPresencas() { // Exibe a presença do aluno
        for (int i = 0; i < presencas.size(); i++) {
            System.out.println("Aula " + (i + 1) + ": " + presencas.get(i));
        }
    }
}