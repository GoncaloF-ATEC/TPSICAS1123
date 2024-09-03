fun main() {

    val p = Pessoa("Carlos", 30)
    val p2 = Pessoa("Rui", 30)

    var p3 = p
    println(p)
    println(p.nome)
    println(p.idade)

    println(p)
/*

override fun equals(other: Any?): Boolean {
        if (other is Pessoa){
                return this.nome.length == other.nome.length + 3
        }
        return false
    }
 */

    println(p == p2) // -> t
    println(p2 == p) // -> f
    println(p == p3) // ->


    println("------Escola---------")

    val e = Escola("ATEC", 1998)
    val e2 = Escola("ATEC")
    println(e)
    println(e2)

    var e1 = e

    e1.nome = "novo nome"

    println(e1)
    println(e)


    println("------aluno e prof---------")


    val prof = Professor("nome1_prof", 20, "TPSICAS")
    val al = Aluno("nome1_al", 20, "TPSICAS")

    val lista = listOf(prof, al)
    println(lista)

    println("---------")

    println(lista[0] is Pessoa)
     println(lista[0] is Professor)
     println(lista[0] is Aluno)
   //  println(lista[0] is Escola)

    var my_p = lista[0] as Professor
    println(my_p.mentdoProfessor())

     var my_p1 = lista[0] as? Aluno
    println(my_p1)

     var my_p2 = lista[0] as? Professor
    println(my_p2)

    println("----Data Class-----")


    var t = Turma("TPSICAS")
    var t2 = Turma("TPSICAS")


    println(t)
    println(t == t2)


    println("------")

    val t3 = t

    println(t)
    println(t3)

    t3.nome = "Novo nome"

    println(t3)
    println(t)





}