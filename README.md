# Sistema Acadêmico - FCTE

## Descrição do Projeto

Desenvolvimento de um sistema acadêmico para gerenciar alunos, disciplinas, professores, turmas, avaliações e frequência, utilizando os conceitos de orientação a objetos (herança, polimorfismo e encapsulamento) e persistência de dados em arquivos.

O enunciado do trabalho pode ser encontrado aqui:

- [Trabalho 1 - Sistema Acadêmico](https://github.com/lboaventura25/OO-T06_2025.1_UnB_FCTE/blob/main/trabalhos/ep1/README.md)

## Dados do Aluno

- **Nome completo:** Luccas Rodrigues dos Santos
- **Matrícula:** 241025470
- **Curso:** Orientação a Objetos
- **Turma:** 06

---

## Instruções para Compilação e Execução

1. **Compilação:**  
   Escrever no terminal: `javac Menu.java Aluno.java AlunoEspecial.java AlunoNormal.java DadosDeSalvamento.java Disciplina.java Turma.java`

2. **Execução:**  
   Clicar no comando `Run Java` usando o ambiente do VS Code.

3. **Estrutura de Pastas:**

- Trabalho EP1 de OO
  - EP1-OO-2025_1
    - EP1
      - Aluno.java
      - AlunoEspecial.java
      - AlunoNormal.java
      - DadosDeSalvamento.java
      - Disciplina.java
      - Menu.java
      - Turma.java
    - EP1 (compilado)
      - Aluno.class
      - AlunoEspecial.class
      - AlunoNormal.class
      - DadosDeSalvamento.class
      - Disciplina.class
      - Menu.class
      - Turma.java
    - README.md

4. **Versão do JAVA utilizada:**  
   A versão utilizada foi o `java 21`.

---

## Vídeo de Demonstração

- [Inserir o link para o vídeo no YouTube/Drive aqui]

---

## Prints da Execução

1. Menu Principal:  
   ![alt text](<Prints/MenuPrincipal(Print 1).png>)
   ![alt text](<Prints/MenuPrincipal(Print2).png>)

2. Cadastro de Aluno:  
   ![Inserir Print 2](caminho/do/print2.png)

3. Relatório de Frequência/Notas:  
   ![Inserir Print 3](caminho/do/print3.png)

---

## Principais Funcionalidades Implementadas

- [S] Cadastro, listagem, matrícula e trancamento de alunos (Normais e Especiais)
- [S] Cadastro de disciplinas e criação de turmas (presenciais e remotas)
- [N] Matrícula de alunos em turmas, respeitando vagas e pré-requisitos
- [S] Lançamento de notas e controle de presença
- [S] Cálculo de média final e verificação de aprovação/reprovação
- [N] Relatórios de desempenho acadêmico por aluno, turma e disciplina
- [S] Persistência de dados em arquivos (.txt ou .csv)
- [N] Tratamento de duplicidade de matrículas
- [S] Uso de herança, polimorfismo e encapsulamento

---

## Observações (Extras ou Dificuldades)

Extras:

- O Atributo 'trancamento' da Classe "Aluno" funciona assim: FALSE é porque o semestre não está trancado e TRUE é porque o semestre está trancado.
- O Atributo 'avaliacao' da Classe "Turma" funciona assim: FALSE é porque a forma de avaliação não tem peso (P1 + P2 + P3 + L + S) e TRUE é porque a forma de avaliação tem peso ((P1 + P2 _ 2 + P3 _ 3 + L + S) / 8).
- O Atributo 'formato' da Classe "Turma" funciona assim: TRUE é porque é presencial e FALSE é porque é remoto.

Dificuldades:

- Foi extremamente difícil fazer os dados serem salvos em arquivos. Apesar de ter uma Classe que os salva e os carrega, não está do jeito mais organizado que eu gostaria que fosse. A falta de explicação em aula e de slides a respeito disso atrapalhou bastante o andamento do projeto e comprometeu a criação de outras funcionalidade.
- Não foi possível implementar todas as funcionalidades requeridas inicialmente e algumas poderiam funcionar de forma mais adequada.

---

## Contato

- Email Pessoal: luccasrs2005@gmail.com
