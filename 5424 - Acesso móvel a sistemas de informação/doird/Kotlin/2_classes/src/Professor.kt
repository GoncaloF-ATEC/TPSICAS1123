class Professor(nome: String, idade: Int, var turma: String): Pessoa(nome,idade) {

    fun mentdoProfessor(): String{
        return  "mentdoProfessor"
    }

}