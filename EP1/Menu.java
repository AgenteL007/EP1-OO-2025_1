import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Menu extends DadosDeSalvamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoNormal alunoNormal = new AlunoNormal();
        AlunoEspecial alunoEspecial = new AlunoEspecial();
        Disciplina disciplina = new Disciplina();
        Turma turma = new Turma();
        String arquivoAlunosNormal = "alunosNormal.txt";
        String arquivoAlunosEspecial = "alunosEspecial.txt";
        String arquivoDisciplinas = "disciplinas.txt";
        String arquivoTurmas = "turmas.txt";
        String arquivoNotasAlunoNormal = "notasAlunoNormal.txt";
        String arquivoPresencasAlunoNormal = "presencasAlunoNormal.txt";
        String arquivoPresencasAlunoEspecial = "presencasAlunoEspecial.txt";
        List<AlunoNormal> listaAlunosNormal = new ArrayList<>();
        List<AlunoEspecial> listaAlunosEspecial = new ArrayList<>();
        List<Disciplina> listaDisciplinas = new ArrayList<>();
        List<Turma> listaTurmas = new ArrayList<>();
        List<AlunoNormal> listaNotasAlunoNormal = new ArrayList<>();
        List<AlunoNormal> listaPresencasAlunoNormal = new ArrayList<>();
        List<AlunoEspecial> listaPresencasAlunoEspecial = new ArrayList<>();
        int verificador = 0; // Para encerrar os loops depois

        System.out.println("===== SISTEMA ACADÊMICO DA FCTE =====");
        System.out.println("");
        System.out.println("Seja bem-vindo ao Sistema Acadêmico!");
        System.out.println();

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
                        System.out.println();
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
                                    System.out.println("Função de cadastro selecionada."); // Aluno Normal
                                    System.out.println();

                                    System.out.print("Nome: ");
                                    alunoNormal.setNome(sc.nextLine());
                                    System.out.println();

                                    System.out.print("Matrícula: ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            alunoNormal.setMatricula(sc.nextInt());
                                            sc.nextLine(); // Limpa o buffer
                                            verificador = 1;
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    System.out.print("Curso: ");
                                    alunoNormal.setCurso(sc.nextLine());
                                    System.out.println();

                                    listaAlunosNormal.add(alunoNormal);

                                    salvarAlunosNormal(listaAlunosNormal, arquivoAlunosNormal);

                                    break;
                                case 2:
                                    System.out.println("Função de cadastro selecionada."); // Aluno Especial
                                    System.out.println();

                                    System.out.print("Nome: ");
                                    alunoEspecial.setNome(sc.nextLine());
                                    System.out.println();

                                    System.out.print("Matrícula: ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            alunoEspecial.setMatricula(sc.nextInt());
                                            sc.nextLine(); // Limpa o buffer
                                            verificador = 1;
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    System.out.print("Curso: ");
                                    alunoEspecial.setCurso(sc.nextLine());
                                    System.out.println();

                                    listaAlunosEspecial.add(alunoEspecial);

                                    salvarAlunosEspecial(listaAlunosEspecial, arquivoAlunosEspecial);

                                    break;
                                case 3:
                                    System.out.println("Função de edição selecionada."); // Aluno Normal
                                    System.out.println();

                                    break;
                                case 4:
                                    System.out.println("Função de edição selecionada."); // Aluno Especial
                                    System.out.println();

                                    break;
                                case 5:
                                    System.out.println("Listagem dos alunos cadastrados no sistema:");
                                    System.out.println();

                                    List<AlunoNormal> alunosNormalCarregado = carregarAlunosNormal(arquivoAlunosNormal);

                                    System.out.println("Normal:");
                                    System.out.println();
                                    for (AlunoNormal alunoNormalCarregado : alunosNormalCarregado) {
                                        System.out.println("Nome: " + alunoNormalCarregado.getNome());
                                        System.out.println("Matrícula: " + alunoNormalCarregado.getMatricula());
                                        System.out.println("Curso: " + alunoNormalCarregado.getCurso());
                                        System.out.println("Trancado: " + alunoNormalCarregado.getTrancamento());
                                        System.out
                                                .println("Cursadas: " + alunoNormalCarregado.getDisciplinasCursadas());
                                        System.out
                                                .println("Cursando: " + alunoNormalCarregado.getDisciplinasCursando());
                                        System.out.println("-------------------------");
                                    }

                                    System.out.println();

                                    List<AlunoEspecial> alunosEspecialCarregado = carregarAlunosEspecial(
                                            arquivoAlunosEspecial);

                                    System.out.println("Especial:");
                                    System.out.println();
                                    for (AlunoEspecial alunoEspecialCarregado : alunosEspecialCarregado) {
                                        System.out.println("Nome: " + alunoEspecialCarregado.getNome());
                                        System.out.println("Matrícula: " + alunoEspecialCarregado.getMatricula());
                                        System.out.println("Curso: " + alunoEspecialCarregado.getCurso());
                                        System.out.println("Trancado: " + alunoEspecialCarregado.getTrancamento());
                                        System.out.println(
                                                "Cursadas: " + alunoEspecialCarregado.getDisciplinasCursadas());
                                        System.out.println(
                                                "Cursando: " + alunoEspecialCarregado.getDisciplinasCursando());
                                        System.out.println("-------------------------");
                                    }

                                    break;
                                case 6:
                                    System.out.println("Função de trancamento selecionada.");
                                    System.out.println();

                                    break;
                                case 7:
                                    break; // Volta para o menu
                                default:
                                    System.out.println();
                                    System.out.println("Opção inválida. Tente novamente.");
                            }
                        } else { // Caso não seja digitado um Inteiro
                            System.out.println();
                            System.out.println("Entrada inválida. Digite apenas números.");
                            sc.nextLine();
                        }

                        break;
                    case 2:
                        System.out.println();
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
                                    System.out.println();

                                    System.out.print("Nome: ");
                                    disciplina.setNome(sc.nextLine());
                                    System.out.println();

                                    System.out.print("Código: ");
                                    disciplina.setCodigo(sc.nextLine());
                                    System.out.println();

                                    System.out.print("Carga Horário: ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            disciplina.setCargaHoraria(sc.nextInt());
                                            sc.nextLine(); // Limpa o buffer
                                            verificador = 1;
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    listaDisciplinas.add(disciplina);

                                    salvarDisciplinas(listaDisciplinas, arquivoDisciplinas);

                                    break;
                                case 2:
                                    System.out.println("Função de criação selecionada.");
                                    System.out.println();

                                    System.out.print("Professor: ");
                                    turma.setProfessor(sc.nextLine());
                                    System.out.println();

                                    System.out.print("Semestre: ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            turma.setSemestre(sc.nextInt());
                                            sc.nextLine(); // Limpa o buffer
                                            verificador = 1;
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    System.out.print("Forma de Avaliação Sem Peso (1) / Com Peso (2): ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            int forma = sc.nextInt();
                                            sc.nextLine(); // Limpa o buffer

                                            if (forma == 1) {
                                                // FALSE é (p1 + p2 + p3 + l + s) / 5
                                            } else if (forma == 2) {
                                                turma.setFormato(true); // TRUE é (p1 + p2 * 2 + p3 * 3 + l + s) / 8
                                            }
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    System.out.print("Formato Presencial (1) / Remoto (2): ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            int formato = sc.nextInt();
                                            sc.nextLine(); // Limpa o buffer

                                            if (formato == 1) {
                                                // Por padrão, já é TRUE
                                            } else if (formato == 2) {
                                                turma.setFormato(false);
                                            }
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    System.out.print("Sala: ");
                                    turma.setSala(sc.nextLine());
                                    System.out.println();

                                    System.out.print("Horário: ");
                                    turma.setHorario(sc.nextLine());
                                    System.out.println();

                                    System.out.print("Capacidade: ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            turma.setCapacidade(sc.nextInt());
                                            sc.nextLine(); // Limpa o buffer
                                            verificador = 1;
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    listaTurmas.add(turma);

                                    salvarTurmas(listaTurmas, arquivoTurmas);

                                    break;
                                case 3:
                                    System.out.println("Listagem das turmas cadastradas no sistema.");
                                    System.out.println();

                                    List<Turma> turmasCarregado = carregarTurmas(arquivoTurmas);

                                    for (Turma turmaCarregado : turmasCarregado) {
                                        System.out.println("Professor: " + turmaCarregado.getProfessor());
                                        System.out.println("Semestre: " + turmaCarregado.getSemestre());
                                        System.out.println("Avaliação: " + turmaCarregado.getAvaliacao());
                                        System.out.println("Formato: " + turmaCarregado.getFormato());
                                        System.out.println("Sala: " + turmaCarregado.getSala());
                                        System.out.println("Horário: " + turmaCarregado.getHorario());
                                        System.out.println("Capacidade: " + turmaCarregado.getCapacidade());
                                        System.out.println("-------------------------");
                                    }

                                    System.out.println();

                                    break;
                                case 4:
                                    break; // Volta para o menu
                                default:
                                    System.out.println();
                                    System.out.println("Opção inválida. Tente novamente.");
                            }
                        } else { // Caso não seja digitado um Inteiro
                            System.out.println();
                            System.out.println("Entrada inválida. Digite apenas números.");
                            sc.nextLine();
                        }

                        break;
                    case 3:
                        System.out.println();
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
                                    System.out.println();

                                    System.out.print("Nome: ");
                                    alunoNormal.setNome(sc.nextLine());
                                    System.out.println();

                                    System.out.print("Matrícula: ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            alunoNormal.setMatricula(sc.nextInt());
                                            sc.nextLine(); // Limpa o buffer
                                            verificador = 1;
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    System.out.print("Nota da P1: ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            alunoNormal.setP1(sc.nextInt());
                                            sc.nextLine(); // Limpa o buffer
                                            verificador = 1;
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    System.out.print("Nota da P2: ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            alunoNormal.setP2(sc.nextInt());
                                            sc.nextLine(); // Limpa o buffer
                                            verificador = 1;
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    System.out.print("Nota da P3: ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            alunoNormal.setP3(sc.nextInt());
                                            sc.nextLine(); // Limpa o buffer
                                            verificador = 1;
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    System.out.print("Nota da Lista de Exercícios: ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            alunoNormal.setL(sc.nextInt());
                                            sc.nextLine(); // Limpa o buffer
                                            verificador = 1;
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    System.out.print("Nota do Seminário: ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            alunoNormal.setS(sc.nextInt());
                                            sc.nextLine(); // Limpa o buffer
                                            verificador = 1;
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    salvarNotasAlunoNormal(listaNotasAlunoNormal, arquivoNotasAlunoNormal);

                                    break;
                                case 2:
                                    System.out.println("Função de lançamento de presença selecionada.");
                                    System.out.println();
                                    System.out.print("Aluno Normal (1) / Especial (2): ");
                                    verificador = 0;
                                    while (verificador == 0) {
                                        if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                            int aluno = sc.nextInt();
                                            sc.nextLine(); // Limpa o buffer

                                            if (aluno == 1) {
                                                System.out.print("Nome: ");
                                                alunoNormal.setNome(sc.nextLine());
                                                System.out.println();

                                                System.out.print("Matrícula: ");
                                                verificador = 0;
                                                while (verificador == 0) {
                                                    if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                                        alunoNormal.setMatricula(sc.nextInt());
                                                        sc.nextLine(); // Limpa o buffer
                                                        verificador = 1;
                                                    } else { // Caso não seja digitado um Inteiro
                                                        System.out.println();
                                                        System.out.println("Entrada inválida. Digite apenas números.");
                                                        sc.nextLine();
                                                    }
                                                }
                                                System.out.println();

                                                alunoNormal.setPresencas(alunoNormal.presencas);

                                                salvarPresencasAlunoNormal(listaPresencasAlunoNormal,
                                                        arquivoPresencasAlunoNormal);

                                            } else if (aluno == 2) {
                                                System.out.print("Nome: ");
                                                alunoEspecial.setNome(sc.nextLine());
                                                System.out.println();

                                                System.out.print("Matrícula: ");
                                                verificador = 0;
                                                while (verificador == 0) {
                                                    if (sc.hasNextInt()) { // Verifica se a próxima entrada é um Inteiro
                                                        alunoEspecial.setMatricula(sc.nextInt());
                                                        sc.nextLine(); // Limpa o buffer
                                                        verificador = 1;
                                                    } else { // Caso não seja digitado um Inteiro
                                                        System.out.println();
                                                        System.out.println("Entrada inválida. Digite apenas números.");
                                                        sc.nextLine();
                                                    }
                                                }
                                                System.out.println();

                                                alunoEspecial.setPresencas(alunoEspecial.presencas);

                                                salvarPresencasAlunoEspecial(listaPresencasAlunoEspecial,
                                                        arquivoPresencasAlunoEspecial);

                                            }
                                        } else { // Caso não seja digitado um Inteiro
                                            System.out.println();
                                            System.out.println("Entrada inválida. Digite apenas números.");
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println();

                                    break;
                                case 3:
                                    System.out.println("Listagem de aprovados e reprovados selecionada.");
                                    System.out.println();

                                    List<AlunoNormal> notasAlunoNormalCarregado = carregarNotasAlunoNormal(
                                            arquivoNotasAlunoNormal);
                                    List<AlunoNormal> presencasAlunoNormalCarregado = carregarPresencasAlunoNormal(
                                            arquivoPresencasAlunoNormal);

                                    System.out.println("Normal:");
                                    System.out.println();
                                    for (AlunoNormal notaAlunoNormalCarregado : notasAlunoNormalCarregado) {
                                        System.out.println("Nome: " + notaAlunoNormalCarregado.getNome());
                                        System.out.println("Matrícula " + notaAlunoNormalCarregado.getMatricula());
                                        System.out.println("Nota da P1: " + notaAlunoNormalCarregado.getP1());
                                        System.out.println("Nota da P2: " + notaAlunoNormalCarregado.getP2());
                                        System.out.println("Nota da P3: " + notaAlunoNormalCarregado.getP3());
                                        System.out.println(
                                                "Nota da Lista de Exercícios: " + notaAlunoNormalCarregado.getL());
                                        System.out.println("Nota do Seminário: " + notaAlunoNormalCarregado.getS());
                                        System.out.print("Sem Peso: ");
                                        notaAlunoNormalCarregado.verificarAprovacaoSemPeso(
                                                notaAlunoNormalCarregado.getP1(),
                                                notaAlunoNormalCarregado.getP2(), notaAlunoNormalCarregado.getP3(),
                                                notaAlunoNormalCarregado.getL(), notaAlunoNormalCarregado.getS());
                                        System.out.print("Com Peso: ");
                                        notaAlunoNormalCarregado.verificarAprovacaoComPeso(
                                                notaAlunoNormalCarregado.getP1(),
                                                notaAlunoNormalCarregado.getP2(), notaAlunoNormalCarregado.getP3(),
                                                notaAlunoNormalCarregado.getL(), notaAlunoNormalCarregado.getS());
                                        System.out.println("-------------------------");
                                    }
                                    for (AlunoNormal presencaAlunoNormalCarregado : presencasAlunoNormalCarregado) {
                                        System.out.println("Nome: " + presencaAlunoNormalCarregado.getNome());
                                        System.out.println("Matrícula " + presencaAlunoNormalCarregado.getMatricula());
                                        presencaAlunoNormalCarregado.exibirPresencas();
                                        System.out.println("-------------------------");
                                    }

                                    System.out.println();

                                    List<AlunoEspecial> presencasAlunoEspecialCarregado = carregarPresencasAlunoEspecial(
                                            arquivoPresencasAlunoEspecial);

                                    System.out.println("Especial:");
                                    System.out.println();
                                    for (AlunoEspecial presencaAlunoEspecialCarregado : presencasAlunoEspecialCarregado) {
                                        System.out.println("Nome: " + presencaAlunoEspecialCarregado.getNome());
                                        System.out
                                                .println("Matrícula " + presencaAlunoEspecialCarregado.getMatricula());
                                        presencaAlunoEspecialCarregado.exibirPresencas();
                                        System.out.println("-------------------------");
                                    }

                                    System.out.println();

                                    break;
                                case 4:
                                    System.out.println("Função de exibição de relatórios por turma selecionada.");
                                    System.out.println();

                                    break;
                                case 5:
                                    System.out.println("Função de exibição de relatórios por disciplina selecionada.");
                                    System.out.println();

                                    break;
                                case 6:
                                    System.out.println("Função de exibição de relatórios por professor selecionada.");
                                    System.out.println();

                                    break;
                                case 7:
                                    System.out.println("Função de exibição de boletim COM dados da turma selecionada.");
                                    System.out.println();

                                    break;
                                case 8:
                                    System.out.println("Função de exibição de boletim SEM dados da turma selecionada.");
                                    System.out.println();

                                    break;
                                case 9:
                                    break; // Volta para o menu
                                default:
                                    System.out.println();
                                    System.out.println("Opção inválida. Tente novamente.");

                                    break;
                            }
                        } else { // Caso não seja digitado um Inteiro
                            System.out.println();
                            System.out.println("Entrada inválida. Digite apenas números.");
                            sc.nextLine();
                        }

                        break;
                    case 4:
                        System.out.println();
                        System.out.println("Sistema fechado. Tenha um bom dia!");
                        System.out.println();
                        sc.close();
                        return;
                    default:
                        System.out.println();
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } else { // Caso não seja digitado um Inteiro
                System.out.println();
                System.out.println("Entrada inválida. Digite apenas números.");
                sc.nextLine();
            }

            System.out.println(); // Quebra de linha
        }
    }
}