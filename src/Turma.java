public class Turma {
    private int identificador;
    private Aluno aluno01;
    private Aluno aluno02;
    private Aluno aluno03;
    private Aluno aluno04;
    private Aluno aluno05;

    public Turma(int identificador) {
        this.identificador = identificador;
    }

    public void adicionarAlunos(Aluno a1, Aluno a2, Aluno a3, Aluno a4, Aluno a5) {
        this.aluno01 = a1;
        this.aluno02 = a2;
        this.aluno03 = a3;
        this.aluno04 = a4;
        this.aluno05 = a5;
    }

    public int quantidadeAlunos() {
        int quantidade = 0;

        if (aluno01 != null) quantidade++;
        if (aluno02 != null) quantidade++;
        if (aluno03 != null) quantidade++;
        if (aluno04 != null) quantidade++;
        if (aluno05 != null) quantidade++;

        return quantidade;
    }

    public double mediaTurma() {

        int quantidade = quantidadeAlunos();
        if (quantidade == 0) {
            return 0.0;
        }
        double somaNotas = aluno01.getNota() + aluno02.getNota() + aluno03.getNota() + aluno04.getNota() + aluno05.getNota();
        return somaNotas / quantidade;
    }

    @Override
    public String toString() {
        return "Turma " + identificador + ":\n" +
                "Aluno 1: " + aluno01 + "\n" +
                "Aluno 2: " + aluno02 + "\n" +
                "Aluno 3: " + aluno03 + "\n" +
                "Aluno 4: " + aluno04 + "\n" +
                "Aluno 5: " + aluno05 + "\n";
    }
}

