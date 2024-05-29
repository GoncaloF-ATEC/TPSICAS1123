//
//  main.swift
//  funcs
//
//  Created by Gonçalo Feliciano on 29/05/2024.
//

import Foundation



func nome(){ //  C# -> public void nome(){}
    
    print("fn Ola Mundo")
}


nome()
nome()

var idade:Int


func nome2(nome:String, ano: Int){
    
    let msg = "\(nome) em \(ano)"
    print(msg)
    
}


nome2(nome: "Gonçalo", ano: 2024)
nome2(nome: "Gonçalo", ano: 2024)


func nome3(nome:String, ano: Int) -> String{
    let msg = "\(nome) em \(ano)"
    return msg
}
print("------------------")
let m1 = nome3(nome: "Gonçalo", ano: 2034)
print(m1)


func nome4(nome:String, ano: Int) -> String{
    "\(nome) em \(ano)" // return "\(nome) em \(ano)"
}

print(nome4(nome: "sem nome", ano: 2323))

print("------------------")
print("------------------")


func soma2(valor1:Int, valor2:Int) -> Int{
    valor1 + valor2  // return valor1 + valor2
}

let f = soma2(valor1: 33,  valor2: 31)



func soma(_ valor1:Int, com valor2:Int) -> Int{
    valor1 + valor2 // return valor1 + valor2
}

func divide(_ valor1:Int, por valor2:Int) -> Double{
    Double(valor1 / valor2)
}

let f2 = soma(301, com: 131)

_ = divide(102, por: 23)

for _ in 0...10{
    print("foo")
}

print("----------------------------------")
// somar todos os int de 0 a n

func contador(n:Int) -> Int{
    
    if n == 0 {
        return 0
    }
    
    
    return n + contador(n: n-1)
    
}


print(contador(n: 3))



func demo(idade:Int? = nil){
    
    guard let idd = idade else {
        print("a idade é nil")
        return
    }
    
    print("a idade é \(idd)")
    
}

demo(idade: 301)

demo(idade: nil)
demo()





/*
 
 
 !
 
 ??
 
 if let
 
 guard let
 
 
 */


// arrays

print("---- arrays ----")

var idades = [12, 89]

print(idades[0])

print(idades)


idades.append(4223)

print(idades)

idades.remove(at: 1)

print(idades)
print("------------------")
print("------------------")
var idades2 = [12, 89, 33]
print(idades2.count)
print(idades2.capacity)
print("----")
idades2.append(222)

print(idades2.count)
print(idades2.capacity)

print("----")
idades2.append(222)

print(idades2.count)
print(idades2.capacity)

print("----")
idades2.append(222)

print(idades2.count)
print(idades2.capacity)

print("----")

print(idades2)
idades2.insert(71, at: 0)
print(idades2)




// foreach (tipo nome in  arr){}

for i in idades2{
    print(i)
    
}

print("----")

idades2.forEach { idd in
    print(idd)
}

