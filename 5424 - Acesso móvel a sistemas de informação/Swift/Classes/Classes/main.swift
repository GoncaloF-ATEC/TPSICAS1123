//
//  main.swift
//  Classes
//
//  Created by Gonçalo Feliciano on 12/06/2024.
//


/*
 var e let
 operações
 condições
 if
 swtich
 loops
 for
 while
 Tuplos
 funcs
 opts
 Collections
 Arrays
 Set
 Dict
 Classes
 Singleton
 

 
 */


import Foundation
 
print("-------- class --------")
var p1 = Pessoa(nome: "Ana", idade: 19, altura: 170, peso: 65)

var p12 = p1

print(p12.idade)
print(p1.idade)
print("--")
p12.idade = 99

print(p12.idade)
print(p1.idade)


func setIdade(p:Pessoa, idade:Int){
    p.idade = idade
}
setIdade(p: p1, idade: 16)


print(p1.idade)





print(p1 === p12)


var p13 = Pessoa(nome: "Ana", idade: 19, altura: 170, peso: 65)
var p14 = Pessoa(nome: "Ana", idade: 19, altura: 170, peso: 65)


//print(p13 == p14)



print("-------- struct --------")
var ps1 = Pessoa2(nome: "Ana", idade: 19, alturaCm: 170, peso: 65)


var ps12 = ps1

print(ps12.idade)
print(ps1.idade)
print("--")
ps12.idade = 99

print(ps12.idade)
print(ps1.idade)


//print(ps1 == ps12)

print(ps1)



/*
print(p1.alturaCm)
print(p1.idade)
print("-------------")
p1.envelhercer()

print(p1.alturaCm)
print(p1.idade)

print("-------------")
p1.envelhercer()

print(p1.alturaCm)
print(p1.idade)


print("-------------")
p1.envelhercer()

print(p1.alturaCm)
print(p1.idade)

print("-------------")
p1.envelhercer()

print(p1.alturaCm)
print(p1.idade)

 
 
 
 
*/


var p6 =  Pessoa(nome: "Ana", idade: 19, altura: 170, peso: 65)



print(Pessoa.shared.nome)
