import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DadosDeSalvamento {
    private static ArrayList<String> stringParaLista(String texto) {
        ArrayList<String> lista = new ArrayList<>();

        if (texto != null && !texto.trim().isEmpty()) {
            String[] partes = texto.split(",");
            for (String item : partes) {
                lista.add(item.trim());
            }
        }

        return lista;
    }

    public static void salvarAlunosNormal(List<AlunoNormal> alunosNormal, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (AlunoNormal alunoNormal : alunosNormal) {
                writer.write("Nome: " + alunoNormal.getNome());
                writer.newLine();
                writer.write("Matrícula: " + alunoNormal.getMatricula());
                writer.newLine();
                writer.write("Curso: " + alunoNormal.getCurso());
                writer.newLine();
                writer.write("Trancado: " + alunoNormal.getTrancamento());
                writer.newLine();
                writer.write("Disciplinas que já forma cursadas com sucesso: " + alunoNormal.getDisciplinasCursadas());
                writer.newLine();
                writer.write("Disciplinas que estão sendo cursadas no semestre atual: "
                        + alunoNormal.getDisciplinasCursando());
                writer.newLine();
                writer.write("-------------------------");
                writer.newLine();
            }
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados. Tente novamente.");
            e.printStackTrace();
        }
    }

    public static List<AlunoNormal> carregarAlunosNormal(String arquivo) {
        List<AlunoNormal> alunosNormal = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            AlunoNormal alunoNormal = null;

            while ((linha = leitor.readLine()) != null) {
                if (linha.startsWith("Nome: ")) {
                    alunoNormal = new AlunoNormal();
                    alunoNormal.setNome(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Matrícula: ")) {
                    alunoNormal.setMatricula(Integer.parseInt(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Curso: ")) {
                    alunoNormal.setCurso(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Trancado: ")) {
                    alunoNormal.setTrancamento(Boolean.parseBoolean(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Disciplinas cursadas: ")) {
                    alunoNormal.setDisciplinasCursadas(stringParaLista(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Disciplinas cursando: ")) {
                    alunoNormal.setDisciplinasCursando(stringParaLista(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("-------------------------")) {
                    alunosNormal.add(alunoNormal); // Fim de um aluno
                }
            }

            System.out.println("Alunos carregados com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo: " + e.getMessage());
        }

        return alunosNormal;
    }

    public static void salvarAlunosEspecial(List<AlunoEspecial> alunosEspecial, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (AlunoEspecial alunoEspecial : alunosEspecial) {
                writer.write("Nome: " + alunoEspecial.getNome());
                writer.newLine();
                writer.write("Matrícula: " + alunoEspecial.getMatricula());
                writer.newLine();
                writer.write("Curso: " + alunoEspecial.getCurso());
                writer.newLine();
                writer.write("Trancado: " + alunoEspecial.getTrancamento());
                writer.newLine();
                writer.write(
                        "Disciplinas que já forma cursadas com sucesso: " + alunoEspecial.getDisciplinasCursadas());
                writer.newLine();
                writer.write("Disciplinas que estão sendo cursadas no semestre atual: "
                        + alunoEspecial.getDisciplinasCursando());
                writer.newLine();
                writer.write("-------------------------");
                writer.newLine();
            }
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados. Tente novamente.");
            e.printStackTrace();
        }
    }

    public static List<AlunoEspecial> carregarAlunosEspecial(String arquivo) {
        List<AlunoEspecial> alunosEspecial = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            AlunoEspecial alunoEspecial = null;

            while ((linha = leitor.readLine()) != null) {
                if (linha.startsWith("Nome: ")) {
                    alunoEspecial = new AlunoEspecial();
                    alunoEspecial.setNome(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Matrícula: ")) {
                    alunoEspecial.setMatricula(Integer.parseInt(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Curso: ")) {
                    alunoEspecial.setCurso(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Trancado: ")) {
                    alunoEspecial.setTrancamento(Boolean.parseBoolean(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Disciplinas cursadas: ")) {
                    alunoEspecial.setDisciplinasCursadas(stringParaLista(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Disciplinas cursando: ")) {
                    alunoEspecial.setDisciplinasCursando(stringParaLista(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("-------------------------")) {
                    alunosEspecial.add(alunoEspecial); // Fim de um aluno
                }
            }

            System.out.println("Alunos carregados com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo: " + e.getMessage());
        }

        return alunosEspecial;
    }

    public static void salvarDisciplinas(List<Disciplina> Disciplinas, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (Disciplina disciplina : Disciplinas) {
                writer.write("Nome: " + disciplina.getNome());
                writer.newLine();
                writer.write("Código: " + disciplina.getCodigo());
                writer.newLine();
                writer.write("Carga Horária: " + disciplina.getCargaHoraria());
                writer.newLine();
                writer.write("Pré-Requisitos: " + disciplina.getPreRequisitos());
                writer.newLine();

                Turma turma = disciplina.getTurma();

                writer.write("Professor: " + turma.getProfessor());
                writer.newLine();
                writer.write("Semestre: " + turma.getSemestre());
                writer.newLine();
                writer.write("Forma de Avaliação: " + turma.getAvaliacao());
                writer.newLine();
                writer.write("Formato: " + turma.getFormato());
                writer.newLine();
                writer.write("Sala: " + turma.getSala());
                writer.newLine();
                writer.write("Horário: " + turma.getHorario());
                writer.newLine();
                writer.write("Capacidade: " + turma.getCapacidade());
                writer.newLine();
                writer.write("-------------------------");
                writer.newLine();
            }
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados. Tente novamente.");
            e.printStackTrace();
        }
    }

    public static List<Disciplina> carregarDisciplinas(String arquivo) {
        List<Disciplina> disciplinas = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            Disciplina disciplina = null;
            Turma turma = null;

            while ((linha = leitor.readLine()) != null) {
                if (linha.startsWith("Nome: ")) {
                    disciplina = new Disciplina();
                    turma = new Turma();
                    disciplina.setNome(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Código: ")) {
                    disciplina.setCodigo(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Carga Horária: ")) {
                    disciplina.setCargaHoraria(Integer.parseInt(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Pré-Requisitos: ")) {
                    disciplina.setPreRequisitos(stringParaLista(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Professor: ")) {
                    turma.setProfessor(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Semestre: ")) {
                    turma.setSemestre(Integer.parseInt(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Forma de Avaliação: ")) {
                    turma.setAvaliacao(Boolean.parseBoolean(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Formato: ")) {
                    turma.setFormato(Boolean.parseBoolean(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Sala: ")) {
                    turma.setSala(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Horário: ")) {
                    turma.setHorario(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Capacidade: ")) {
                    turma.setCapacidade(Integer.parseInt(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("-------------------------")) {
                    disciplina.setTurma(turma);
                    disciplinas.add(disciplina); // Fim de uma disciplina
                }
            }

            System.out.println("Disciplinas carregadas com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo: " + e.getMessage());
        }

        return disciplinas;
    }

    public static void salvarTurmas(List<Turma> Turmas, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (Turma turma : Turmas) {
                writer.write("Professor: " + turma.getProfessor());
                writer.newLine();
                writer.write("Semestre: " + turma.getSemestre());
                writer.newLine();
                writer.write("Forma de Avaliação: " + turma.getAvaliacao());
                writer.newLine();
                writer.write("Formato: " + turma.getFormato());
                writer.newLine();
                writer.write("Sala: " + turma.getSala());
                writer.newLine();
                writer.write("Horário: " + turma.getHorario());
                writer.newLine();
                writer.write("Capacidade: " + turma.getCapacidade());
                writer.newLine();
                writer.write("-------------------------");
                writer.newLine();
            }
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados. Tente novamente.");
            e.printStackTrace();
        }
    }

    public static List<Turma> carregarTurmas(String arquivo) {
        List<Turma> turmas = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            Turma turma = null;

            while ((linha = leitor.readLine()) != null) {
                if (linha.startsWith("Nome: ")) {
                    turma = new Turma();
                } else if (linha.startsWith("Professor: ")) {
                    turma.setProfessor(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Semestre: ")) {
                    turma.setSemestre(Integer.parseInt(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Forma de Avaliação: ")) {
                    turma.setAvaliacao(Boolean.parseBoolean(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Formato: ")) {
                    turma.setFormato(Boolean.parseBoolean(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Sala: ")) {
                    turma.setSala(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Horário: ")) {
                    turma.setHorario(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Capacidade: ")) {
                    turma.setCapacidade(Integer.parseInt(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("-------------------------")) {
                    turmas.add(turma); // Fim de uma turma
                }
            }

            System.out.println("Turmas carregadas com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo: " + e.getMessage());
        }
        return turmas;
    }

    public static void salvarNotasAlunoNormal(List<AlunoNormal> alunosNormal, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (AlunoNormal alunoNormal : alunosNormal) {
                writer.write("Nome: " + alunoNormal.getNome());
                writer.newLine();
                writer.write("Matrícula " + alunoNormal.getMatricula());
                writer.newLine();
                writer.write("Nota da P1: " + alunoNormal.getP1());
                writer.newLine();
                writer.write("Nota da P2: " + alunoNormal.getP2());
                writer.newLine();
                writer.write("Nota da P3: " + alunoNormal.getP3());
                writer.newLine();
                writer.write("Lista de Exercícios: " + alunoNormal.getL());
                writer.newLine();
                writer.write("Seminário: " + alunoNormal.getS());
                writer.newLine();
                writer.write("-------------------------");
                writer.newLine();
            }
            System.out.println("Notas salvas com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar as notas. Tente novamente.");
            e.printStackTrace();
        }
    }

    public static List<AlunoNormal> carregarNotasAlunoNormal(String arquivo) {
        List<AlunoNormal> alunosNormal = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            AlunoNormal alunoNormal = null;

            while ((linha = leitor.readLine()) != null) {
                if (linha.startsWith("Nome: ")) {
                    alunoNormal = new AlunoNormal();
                    alunoNormal.setNome(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Matrícula: ")) {
                    alunoNormal.setMatricula(Integer.parseInt(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Nota da P1: ")) {
                    alunoNormal.setP1(Float.parseFloat(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Nota da P2: ")) {
                    alunoNormal.setP2(Float.parseFloat(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Nota da P3: ")) {
                    alunoNormal.setP3(Float.parseFloat(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Nota da Lista de Exercícios: ")) {
                    alunoNormal.setL(Float.parseFloat(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Nota do Seminário: ")) {
                    alunoNormal.setS(Float.parseFloat(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("-------------------------")) {
                    alunosNormal.add(alunoNormal); // Fim das notas de um aluno
                }
            }

            System.out.println("Notas carregadas com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo: " + e.getMessage());
        }

        return alunosNormal;
    }

    public static void salvarPresencasAlunoNormal(List<AlunoNormal> alunosNormal, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (AlunoNormal alunoNormal : alunosNormal) {
                writer.write("Nome: " + alunoNormal.getNome());
                writer.newLine();
                writer.write("Matrícula " + alunoNormal.getMatricula());
                writer.newLine();
                writer.write("Presença: " + alunoNormal.getPresencas());
                writer.newLine();
                writer.write("-------------------------");
                writer.newLine();
            }
            System.out.println("Presença salva com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar a presença. Tente novamente.");
            e.printStackTrace();
        }
    }

    public static List<AlunoNormal> carregarPresencasAlunoNormal(String arquivo) {
        List<AlunoNormal> alunosNormal = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            AlunoNormal alunoNormal = null;

            while ((linha = leitor.readLine()) != null) {
                if (linha.startsWith("Nome: ")) {
                    alunoNormal = new AlunoNormal();
                    alunoNormal.setNome(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Matrícula: ")) {
                    alunoNormal.setMatricula(Integer.parseInt(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Presença: ")) {
                    alunoNormal.setPresencas(stringParaLista(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("-------------------------")) {
                    alunosNormal.add(alunoNormal); // Fim da presença de um aluno
                }
            }

            System.out.println("Presença carregada com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo: " + e.getMessage());
        }

        return alunosNormal;
    }

    public static void salvarPresencasAlunoEspecial(List<AlunoEspecial> listaPresencasAlunoEspecial, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (AlunoEspecial alunoEspecial : listaPresencasAlunoEspecial) {
                writer.write("Nome: " + alunoEspecial.getNome());
                writer.newLine();
                writer.write("Matrícula " + alunoEspecial.getMatricula());
                writer.newLine();
                writer.write("Presença: " + alunoEspecial.getPresencas());
                writer.newLine();
                writer.write("-------------------------");
                writer.newLine();
            }
            System.out.println("Presença salva com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar a presença. Tente novamente.");
            e.printStackTrace();
        }
    }

    public static List<AlunoEspecial> carregarPresencasAlunoEspecial(String arquivo) {
        List<AlunoEspecial> alunosEspecial = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            AlunoEspecial alunoEspecial = null;

            while ((linha = leitor.readLine()) != null) {
                if (linha.startsWith("Nome: ")) {
                    alunoEspecial = new AlunoEspecial();
                    alunoEspecial.setNome(linha.split(": ", 2)[1]);
                } else if (linha.startsWith("Matrícula: ")) {
                    alunoEspecial.setMatricula(Integer.parseInt(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("Presença: ")) {
                    alunoEspecial.setPresencas(stringParaLista(linha.split(": ", 2)[1]));
                } else if (linha.startsWith("-------------------------")) {
                    alunosEspecial.add(alunoEspecial); // Fim da presença de um aluno
                }
            }

            System.out.println("Presença carregada com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo: " + e.getMessage());
        }

        return alunosEspecial;
    }
}