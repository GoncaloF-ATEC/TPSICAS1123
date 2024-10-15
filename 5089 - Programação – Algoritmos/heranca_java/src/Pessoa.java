public class Pessoa {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void funcPessoa() {
        System.out.println("funcPessoa");
    }


    @Override
    public String toString() {
        return "Pessoa";
    }
}
