class Aluno(nome: String, idade: Int, var turma: String): Pessoa(nome,idade) {

    fun mentdoAluno(){
        println("mentdoAluno")
    }

}