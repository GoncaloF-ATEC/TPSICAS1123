//
//  Pessoa.swift
//  Classes
//
//  Created by Gonçalo Feliciano on 12/06/2024.
//

import Foundation

/*
 


 Atributos: 
 nome,
 idade,
 peso
 altura
 
 Métodos: 
 Envelhercer <-  a cada ano que nossa pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.
 engordar
 emagrecer
 crescer.

 
 */

struct Pessoa2{
    
    var nome: String
    var idade: Int
    var alturaCm: Float
    var peso: Float

}


class Pessoa{
    
    static var shared =  Pessoa(nome: "Ana", idade: 19, altura: 170, peso: 65)
    
    var nome: String
    var idade: Int
    var alturaCm: Float
    var peso: Float
    
    init(nome: String, idade: Int, altura: Float, peso: Float) {
        self.nome = nome
        self.idade = idade
        self.alturaCm = altura
        self.peso = peso
    }
    
    
    func envelhercer(anos: Int = 1){
        
        if self.idade < 21 {
            self.crescer()
        }
        
        self.idade += anos
        
        
    }
    
    func engordar(kg: Float){
        self.peso += kg
    }
    
    func emagrecer(kg: Float){
        self.peso -= kg
    }
    
    func crescer(cm: Float = 0.5){
        self.alturaCm += cm
        
    }
    
}
