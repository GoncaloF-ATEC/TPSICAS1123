open class Pessoa {

    var nome: String
    var idade: Int

    constructor(nome: String, idade: Int){
        this.nome = nome
        this.idade = idade
    }

    init {
        println("o obj foi Criado")
    }

    private fun getData(): String{
        return "nome:${this.nome}\nidade:${this.idade}"
    }


    override fun equals(other: Any?): Boolean {
        if (other is Pessoa){
           return this.nome.length == other.nome.length + 3
        }
        return false
    }

    override fun toString(): String {
        return this.getData()
    }
}