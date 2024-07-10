//
//  Aluno.swift
//  heranca_v1
//
//  Created by Gonçalo Feliciano on 26/06/2024.
//

import Foundation


class Aluno: Pessoa{
    
    var turma: String
    
    init(nome: String, idade: UInt8, turma: String) {
        
        self.turma = turma
        super.init(nome: nome, idade: idade)
    }
    
    override func getInfo() -> String {
        "\(super.getInfo())\nturma: \(self.turma)"

    }
    
}
