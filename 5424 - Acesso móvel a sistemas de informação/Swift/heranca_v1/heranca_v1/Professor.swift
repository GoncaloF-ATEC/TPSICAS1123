//
//  Professor.swift
//  heranca_v1
//
//  Created by Gonçalo Feliciano on 26/06/2024.
//

import Foundation


class Professor: Pessoa{
    var listaTurmas:[String]
    
    init(nome: String, idade: UInt8, listaTurmas: [String] = []) {
        self.listaTurmas = listaTurmas
        super.init(nome: nome, idade: idade)
    }
    
    override func getInfo() -> String {
        super.getInfo() + "\nLista turmas: \(self.listaTurmas)"
    }
    
    
}


