public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Teco", 19, "A123", 5.5);
        Aluno aluno2 = new Aluno("Bilia", 22, "A656", 3.8);
        Aluno aluno3 = new Aluno("Carlos", 21, "A789", 9.0);
        Aluno aluno4 = new Aluno("Anthos", 23, "A222", 5.0);
        Aluno aluno5 = new Aluno("Pedro", 23, "A456", 6.2);
        Aluno aluno6 = new Aluno("Julia", 20, "A789", 7.5);
        Aluno aluno7 = new Aluno("Laris", 22, "A125", 6.5);
        Aluno aluno8 = new Aluno("Mario", 21, "A234", 9.7);


        Turma turma1 = new Turma(1);
        Turma turma2 = new Turma(2);

        turma1.adicionarAlunos(aluno1, aluno2, aluno3, aluno4, aluno5);
        turma2.adicionarAlunos(aluno6, aluno7, aluno8, aluno1, aluno2); //alguns alunos em comum

        System.out.println(turma1.toString());
        System.out.println(turma2.toString());


        System.out.println("Quantidade de alunos na Turma 1: " + turma1.quantidadeAlunos());
        System.out.println("Quantidade de alunos na Turma 2: " + turma2.quantidadeAlunos());

        // Exiba média das turmas.
        System.out.println("Média da Turma 1: " + turma1.mediaTurma());
        System.out.println("Média da Turma 2: " + turma2.mediaTurma());
    }

}
