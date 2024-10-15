public class Aluno extends Pessoa{


    public Aluno(String nome, int idade) {
        super(nome, idade);
    }


    public void funcAluno() {
        System.out.println("funcAluno");
    }

    @Override
    public String toString() {
        return "Aluno";
    }
}
