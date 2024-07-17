fun main() {

    // Arrays

    var arr1 = arrayOf(1,2,3,4,5)
    println(arr1.size)
    println(arr1.contentToString())
    println(arr1.get(2))
    println(arr1[2])

    // println(arr1.get(10))
    // println(arr1[10])


    arr1[2] = 99

    println(arr1.get(2))
    println(arr1[2])


    arr1.set(2, 88)
    println(arr1[2])

println("-----------")
    var marr = mutableListOf<Int>() // ArrayList
    println(marr.size)

    marr.add(88)
    marr.add(90)
    println(marr)

    println(marr.size)


    marr.add(1, 100)

    println(marr)


    marr.addFirst(-1)
    marr.addLast(99999) // marr.add(99999)

    println(marr)

    var marr2 = marr + 888

    println(marr2)


    val marr3 = marr2 + marr

    println(marr3)

    val marr4 = marr2 - marr

    println(marr4)

    println(marr)
    println(marr2)

    val marr5 = marr - marr2
    println(marr5)

    println("------------for (elm in marr3) ------------")

    //marr3

    for (elm in marr3) {  // for (elm in 10 .. 20)
        println(elm)
    }

    println("--------------   marr3.forEach { elm -> ---------------------")

    marr3.forEach { elm ->
        println(elm)
    }



    println("------------ marr.filter ---------------")

    println(marr)

    var res = marr.filter { elm -> elm > 90}

    println(res)

    var res2 = marr.filter { elm -> elm < 90}

    println(res2)


    println("------------ marr.map ---------------")
    println(marr)

    var res_map = marr.map {
        elm -> elm * 100
    }

    println(res_map)


    println("------------ marr.reduce ---------------")

    var marr6 = mutableListOf(1,2,3,4,5)

    var res_reduce = marr6.reduce { elm, elm2 -> (elm * 2) + (elm2 / 2) }

    println(res_reduce)



    println("------------ marr.reduce v2 ---------------")


    marr6 = mutableListOf(1,2,3,4,5)

    var res_reduce2 = marr6.reduce { elm, elm2 -> redFunc(elm, elm2) }

    println(res_reduce2)


    // Dict
println("------------ mutableMapOf ( dict )  -----------")

    var dict = mutableMapOf<String, Int>()

    dict["a"] = 5
    dict["b"] = 15
    dict["c"] = 20
    println(dict)


    dict["c"] = 40
    println(dict)

    dict.set("c", 40)
    println(dict)



    var dict2 = mutableMapOf<String, Int>(
        "key1" to 10,
        "key2" to 20,
        "key3" to 30,
        "key4" to 40,
        "key5" to 50
    )

println(dict2)


    println("----------")

    for (elm in dict2) {
        println(elm.value)
    }


    println("----------")


    dict2.forEach{ k, v ->
        println(k)
        println(v)
    }

    println("----------")
    dict2.forEach{elm ->
     //   println(elm.key)
      //  println(elm.value)
       // println(elm)

        println("key: ${elm.key}, value: ${elm.value}")
    }

    println("----------");  println("----------")






// str


    /*
     'e' <- char
     "e" <- str
     */

    var f = "xtestex"

    for (ch in f) {

        println(ch)
    }

    println("------")

    println(f[0] == 'x')
    println(f[0] == 'X')

    println(f.contains("teste"))
    println(f.startsWith("teste"))
    println(f.startsWith("xtes"))
    println(f.endsWith("tex"))
    
}


fun redFunc(v1:Int, v2:Int ):Int {
    return v1 + v2
}