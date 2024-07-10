//
//  main.swift
//  heranca_v1
//
//  Created by Gonçalo Feliciano on 26/06/2024.
//

import Foundation

var p1 = Pessoa(nome: "nome 1", idade: 20)
/*
print(UInt8.max)
print(UInt8.min)

print(Int8.max)
print(Int8.min)

print(UInt8.isSigned)
print(Int.isSigned)

*/
var p2 = Pessoa(nome: "nome 2", idade: 20)


var al1 = Aluno(nome: "nome Aluno", idade: 20, turma: "PIII")
var al2 = Aluno(nome: "nome Aluno 2", idade: 20, turma: String.semDados)


var prof1 = Professor(nome: "nome Prof 1", idade: 50, listaTurmas: ["PIII"])
var prof2 = Professor(nome: "nome Prof 2", idade: 60)

var p3 = prof1 as Pessoa
print(p3)

var lista_1 = [1, 3]
var lista = [p1, p2, al1, al2, prof1, prof2]

print(type(of: lista))

for i in lista{
    print("-----------")
    print(i.getInfo())
    
    /*
    if i is Professor{
        let pl = i as! Professor
        pl.listaTurmas.append("Nova turma")
    }
     */
    
    guard let pl = i as? Professor, pl.listaTurmas.isEmpty else{
        print("Não é Professor")
        continue
    }
    

    pl.listaTurmas.append("Nova turma")

    
    print("-----------")
}


print("------------output-----------")

for i in lista{
    print("-----------")
    print(i.getInfo())
    print("-----------")
}




var notas = [12, 12, 3, 10, 19,12, 12, 3, 10, 19,12, 12, 3, 10, 19,12, 12, 3, 10, 19,12, 12, 3, 10, 19
]

print(lista.calcMedia())
print(notas.calcMedia())


//print(lista.calcMediaV2())
print(notas.calcMediaV2())
