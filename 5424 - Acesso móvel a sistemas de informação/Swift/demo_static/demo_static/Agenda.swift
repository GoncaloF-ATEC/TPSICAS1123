//
//  Agenda.swift
//  demo_static
//
//  Created by Gonçalo Feliciano on 19/06/2024.
//

import Foundation

class Agenda{
    
    static var myAgenda = Agenda()
    
    
    static var count = 0
    
    var listaContactos:[String]
    
    init() {
        self.listaContactos = []
        Agenda.count += 1
    }
    
    
    
    
}
