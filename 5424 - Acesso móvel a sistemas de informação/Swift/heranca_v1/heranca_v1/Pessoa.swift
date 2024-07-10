//
//  Pessoa.swift
//  heranca_v1
//
//  Created by Gonçalo Feliciano on 26/06/2024.
//

import Foundation


class Pessoa{
    var id:UUID
    var nome: String
    var idade: UInt8
    
    init(nome: String, idade: UInt8) {
        self.nome = nome
        self.idade = idade
        self.id = UUID()
    }
    
    func getInfo() -> String{
        "id: \(self.id)\nnome: \(self.nome)\nidade: \(self.idade)"
    }
    
}


