//
//  main.swift
//  demo_static
//
//  Created by Gonçalo Feliciano on 19/06/2024.
//

import Foundation


var a = Agenda()

a.listaContactos.append("Gonçalo")
a.listaContactos.append("Rui")
a.listaContactos.append("Rita")

print(Agenda.count)

var agenda = Agenda()

print(Agenda.count)


Agenda.myAgenda.listaContactos.append("Gonçalo")
Agenda.myAgenda.listaContactos.append("Maria")
Agenda.myAgenda.listaContactos.append("Joana")
