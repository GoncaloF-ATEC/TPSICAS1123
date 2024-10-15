public class Professor extends Pessoa{

    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    public void exibirInfo(){
        System.out.println("exibirInfo professor");
    }

    @Override
    public String toString() {
        return "Professor";
    }
}
