fun main() {

    // comnt

    // comnt 1 linha

    /*
    comnt
    varias
    linhas

     */

    // print


    println("msg 1")
    println("msg 2")

    println("----------")

    print("msg 3")
    print("msg 4")

    println("----------")

    println("msg\n2")

    println("msgs2r\t2")
    println("msgs\t2")

    //conct

      print("msg 3" + 23)

    //var
    println("\n----------")

    var nome = "Gonçalo"
    val nome2: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec cursus ipsum non risus rutrum scelerisque. Phasellus volutpat ullamcorper quam id scelerisque. Sed nulla arcu, sagittis et massa quis, scelerisque tincidunt leo. Phasellus ullamcorper purus at iaculis congue. Proin ultricies commodo quam, sit amet imperdiet ligula pellentesque a. Nullam viverra odio risus, at congue leo finibus sit amet. Proin a hendrerit diam. Praesent a quam sed orci tristique dignissim nec ut lorem."

    var idade = 12;

    var b = false


    println("nome: $nome\nnome2: $nome\nIdade: $idade\nEstado:$b")
    println("----------")
    println("nome: " + nome +"\nnome2: " + nome + "\nIdade: " + idade + "\nEstado:" + b)

    println("----------")

    var nome3 =nome.plus(" Feliciano")
    println(nome3)


    println(nome)
    nome = "novo nome"
  println(nome)


    // const

    val nomeC = "Gonçalo"
    println(nomeC)
    println(nomeC.plus(" Feliciano"))

    //nomeC = "novo"

    var peso1 = 10
    var peso = 10.4
    var peso2: Float = 10.5f

    var d: Double = 10.toDouble()

    var soma = peso + peso2
    println(soma)

     var soma2 = peso + peso1
    println(soma2)

    // if

    println("-----if-----")
    val i = 1

    if (i % 2 == 0) {
        println("$i é par")

    }else if (i == 1) {
        println("$i é um")

    } else {
        println("$i não é par")
    }


    // switch
println("---when----")

    var day = 7
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    println("---when2---")

     when (day) {
        1 ->  println("Monday")
        2 ->  println("Tuesday")
        3 ->  println("Wednesday")
        4 ->  println("Thursday")
        5 ->  println("Friday")
        6 ->  println("Saturday")
        7 ->  println("Sunday")
        else ->  println("Invalid day.")
    }


    // while

    println("-----while----")
    var j = 0;

    while (j < 10){
        println("j = $j")
        j += 1
    }

    println("-----while 2----")

     j = 0;

    while (j < 10){

        println("j = $j")

        j++
    }

    var cond = false
    //cond = dataAtual == 10/08/2025

    while (cond){

        println("cond")

    }




    // range
 println("----- range ----")

    println(0..10)

    println('a'..'z')

    //for
     println("----- for  ----")

    for(i in 1..10){
        println(i)
    }

  println("----- for 2 ----")

    for(i in 'a'..'z'){
        println(i)
    }


    /*
    println("----- for 3 ----")

    for(i in "ab".."ba"){
        println(i)
    }

    */
     println("----- for 3 ----")
    var r1 = 0..10

    for(i in r1){
        println(i)
    }

         println("----- for 4 ----")
    var varFor = "Gonçalo"

    for(ch in varFor){
        if (ch == 'o'){
            continue
        }
        if (ch == 'a'){
            break
        }

        println(ch)
    }
println("fim do for")

    // funcs
    

}