//
//  main.swift
//  demo_2
//
//  Created by Gonçalo Feliciano on 22/05/2024.
//

import Foundation

// tuplos

var tp = ("nome", 19, true)

print(tp)

print(tp.0)

tp.0 = "Luis"

print(tp.0)

print("-----")

var tp2 = (nome:"Ana", idade:30, Insc: true)

print(tp2)

print(tp2.nome)
tp2.nome = "Sem nome"
print(tp2.nome)

print(tp2.1)
print(tp2.idade)


print("-----")

var tp3: (String, Int, Int)

tp3 = ("txt", 10, 15)

print(tp3.0)

var tp4: (nome:String, val1:Int, val2:Int)

tp4 = ("txt", 10, 15)

print(tp4)

tp3 = (n:"txt", v1:10, v2:15)

print(tp3)


tp4 = (nome:"txt", val1:10, val2:15)

print(tp4)

tp4 = (nome:"txt", val1:15, val2:10)

print(tp4)


// range


var r1 = 0...10 // 0 -> 10

var r2 = 0 ..< 10 // 0 -> 9

print(r1)

//loops


print("--- for ---")

// for

var lb = 0
var up = 100

for i in lb ... up where i % 2 == 0 && i % 3 == 0{
   
    if i == 18{
        
        continue
        
    }
    
    if i == 30{
        
        break
    }
    
    
    print(i)
    
    
}




// while
print(Date.now)

print("--- while ---")
var loop_i = 1

while(loop_i < 100 ){
    
    
    if loop_i == 18{
        loop_i += 1
        continue
        
    }
    
    if loop_i == 30{
        
        break
    }
    
    if loop_i % 2 == 0{
        print(loop_i)
    }
    
    
    loop_i += 1  // loop_i = loop_i + 1
        
}




print("final do loop")

print(loop_i)



print("-----------")

var teste = 0

if true{
    print(teste)
    teste = 10
    print(teste)
    var teste = teste
    print(teste)
    
    teste = 40
    
    print(teste)
}

print(teste)




/*
 
 Null =
 nil = swift
 None = py
 
 
 */
//opts
print("-----------------")
print("num 2")
// var num12 = readLine()!


//var num22_i: Int? = Int(num12)
// print(num22_i)


var f: Int // int
var f2: Int? // int opt



f2 = 12
print(f2!)
print(f2)



f2 = 223
if let f2_2 = f2 {
    
    print(f2_2)
    
}else{
    print("f2 é nil")
}


f2 = nil
print(f2 ?? 0)





