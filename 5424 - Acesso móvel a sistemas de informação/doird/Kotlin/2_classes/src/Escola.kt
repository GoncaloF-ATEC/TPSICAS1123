class Escola (var nome:String, var anoFundacao:Int){

    constructor(nome: String) : this(nome, 2003){
        println("Class inicializada")

    }

    override fun toString(): String {
        return "nome: $nome, ano: $anoFundacao"
    }

}