import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Aluno al = new Aluno("Gonçalo", 28);
        System.out.println(al.nome);

        Professor p1 = new Professor("Rui", 40);
        System.out.println(p1.nome);

        Carro c1 = new Carro();

        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        lista.add(al);
        lista.add(p1);

        for (Pessoa p : lista) {
            p.funcPessoa();
        }

        al.funcAluno();
        ((Pessoa)al).funcPessoa();

        Object obj = ((Object)al);

        System.out.println("---------------------------");

        ArrayList<Object> tudo = new ArrayList<Object>();
        tudo.add(al);
        tudo.add(p1);
        tudo.add(c1);

        for (Object p : tudo) { // não e boa prática
            System.out.println("---------------------------");

            if (p instanceof Professor) {
                System.out.println("Professor");
                ((Professor) p).exibirInfo();
            }else {
                System.out.println("outra cosia");
            }
            System.out.println("---------------------------");

            System.out.println(p.toString());

        }




    }
}


/*
class 1
 |
 |
class 2
 |
 |
class 3 (class 3, class 2, class 1)


 */



