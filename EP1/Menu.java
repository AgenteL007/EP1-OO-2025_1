import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== SISTEMA ACADÊMICO DA FCTE =====");
        System.out.println("");
        System.out.println("Seja bem-vindo ao Sistema Acadêmico!");
        System.out.println("");

        while (true) { // Exibe o menu
            System.out.println("Por favor, escolha o modo que deseja acessar ou digite 4 para sair:");
            System.out.println("Modo 1 - Aluno (Normal e Especial)");
            System.out.println("Modo 2 - Disciplina/Turma");
            System.out.println("Modo 3 - Avaliação/Frequência");
            System.out.println("4. Sair");
            System.out.print("Acessar o modo: ");

            if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                int opcaoPrincipal = sc.nextInt();
                sc.nextLine(); // Limpa o buffer

                switch (opcaoPrincipal) { // Processa a opção escolhida
                    case 1:
                        System.out.println("");
                        System.out.println("Modo Aluno (Normal e Especial) selecionado. Escolha uma função:");
                        System.out.println("Função 1 - Cadastrar novo aluno (normal)");
                        System.out.println("Função 2 - Cadastrar novo aluno (especial)");
                        System.out.println("Função 3 - Editar aluno existente");
                        System.out.println("Função 4 - Listar alunos cadastrados no sistema");
                        System.out.println("Função 5 - Trancar disciplina/semestre");
                        System.out.println("6. Voltar para o menu");
                        System.out.print("Acessar a função: ");

                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                            int opcao1 = sc.nextInt();
                            sc.nextLine(); // Limpa o buffer

                            switch (opcao1) {
                                case 1:
                                    System.out.println("Função de cadastro selecionada.");

                                    break;
                                case 2:
                                    System.out.println("Função de cadastro selecionada.");

                                    break;
                                case 3:
                                    System.out.println("Função de edição selecionada.");

                                    break;
                                case 4:
                                    System.out.println("Listagem dos alunos cadastrados no sistema:");

                                    break;
                                case 5:
                                    System.out.println("Função de trancamento selecionada.");

                                    break;
                                case 6:
                                    break; // Volta para o menu
                                default:
                                    System.out.println("");
                                    System.out.println("Opção inválida. Tente novamente.");
                            }
                        } else { // Caso não seja digitado um Inteiro
                            System.out.println("");
                            System.out.println("Entrada inválida. Digite apenas números.");
                            sc.nextLine();
                        }

                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("Modo Disciplina/Turma selecionado. Escolha uma função:");
                        System.out.println("Função 1 - Cadastrar nova disciplina");
                        System.out.println("Função 2 - Criar nova turma");
                        System.out.println("Função 3 - Listar turmas"); // Mostrar também os alunos matriculados
                        System.out.println("4. Voltar para o menu");
                        System.out.print("Acessar a função: ");

                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                            int opcao2 = sc.nextInt();
                            sc.nextLine(); // Limpa o buffer

                            switch (opcao2) {
                                case 1:
                                    System.out.println("Função de cadastro selecionada.");

                                    break;
                                case 2:
                                    System.out.println("Função de criação selecionada.");

                                    break;
                                case 3:
                                    System.out.println("Listagem das turmas cadastradas no sistema.");

                                    break;
                                case 4:
                                    break; // Volta para o menu
                                default:
                                    System.out.println("");
                                    System.out.println("Opção inválida. Tente novamente.");
                            }
                        } else { // Caso não seja digitado um Inteiro
                            System.out.println("");
                            System.out.println("Entrada inválida. Digite apenas números.");
                            sc.nextLine();
                        }

                        break;
                    case 3:
                        System.out.println("");
                        System.out.println("Modo Avaliação/Frequência selecionado. Escolha uma função:");
                        System.out.println("Função 1 - Lançar notas"); // Serão lançadas por turma e mostrará a média
                                                                       // final
                        System.out.println("Função 2 - Lançar presenças"); // Serão lançadas por turma e mostrará a
                                                                           // frequência
                        System.out.println("Função 3 - Aprovados e reprovados"); // Mostra quem passou e quem reprovou
                        System.out.println("Função 4 - Exibir relatórios por turma");
                        System.out.println("Função 5 - Exibir relatórios por disciplina");
                        System.out.println("Função 6 - Exibir relatórios por professor");
                        System.out.println("Função 7 - Exibir boletim COM dados da turma"); // Boletim separado por
                                                                                            // semestre
                        System.out.println("Função 8 - Exibir boletim SEM dados da turma"); // Boletim separado por
                                                                                            // semestre
                        System.out.println("9. Voltar para o menu");
                        System.out.print("Acessar a função: ");

                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                            int opcao3 = sc.nextInt();
                            sc.nextLine(); // Limpa o buffer

                            switch (opcao3) {
                                case 1:
                                    System.out.println("Função de lançamento de notas selecionada.");

                                    break;
                                case 2:
                                    System.out.println("Função de lançamento de presença selecionada.");

                                    break;
                                case 3:
                                    System.out.println("Listagem de aprovados e reprovados selecionada.");

                                    break;
                                case 4:
                                    System.out.println("Função de exibição de relatórios por turma selecionada.");

                                    break;
                                case 5:
                                    System.out.println("Função de exibição de relatórios por disciplina selecionada.");

                                    break;
                                case 6:
                                    System.out.println("Função de exibição de relatórios por professor selecionada.");

                                    break;
                                case 7:
                                    System.out.println("Função de exibição de boletim COM dados da turma selecionada.");

                                    break;
                                case 8:
                                    System.out.println("Função de exibição de boletim COM dados da turma selecionada.");

                                    break;
                                case 9:
                                    break; // Volta para o menu
                                default:
                                    System.out.println("");
                                    System.out.println("Opção inválida. Tente novamente.");

                                    break;
                            }
                        } else { // Caso não seja digitado um Inteiro
                            System.out.println("");
                            System.out.println("Entrada inválida. Digite apenas números.");
                            sc.nextLine();
                        }

                        break;
                    case 4:
                        System.out.println("");
                        System.out.println("Sistema fechado. Tenha um bom dia!");
                        System.out.println("");
                        sc.close();
                        return;
                    default:
                        System.out.println("");
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } else { // Caso não seja digitado um Inteiro
                System.out.println("");
                System.out.println("Entrada inválida. Digite apenas números.");
                sc.nextLine();
            }

            System.out.println(); // Quebra de linha
        }
    }
}