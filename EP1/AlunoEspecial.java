import java.util.Scanner;
import java.util.ArrayList;

public class AlunoEspecial extends Aluno {
    @Override
    public void setDisciplinasCursando(ArrayList<String> disciplinasCursando) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de disciplinas que serão adicionadas: ");
        int disciplinas = sc.nextInt();

        if (disciplinas > 2) {
            System.out.println(
                    "Aluno cadastrado como 'Especial'. Não pode pegar mais do que 2 disciplinas. Tente novamente.");
        } else {
            System.out.println("Agora digite todas as disciplinas que serão cursadas no semestre atual:");

            for (int i = 0; i < disciplinas; i++) {
                String entrada = sc.nextLine();
                disciplinasCursando.add(entrada);
            }

            sc.close(); // Fecha a entrada de leitura do teclado
        }
    }
}