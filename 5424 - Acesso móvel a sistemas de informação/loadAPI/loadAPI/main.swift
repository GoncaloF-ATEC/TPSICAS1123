//
//  main.swift
//  loadAPI
//
//  Created by Gonçalo Feliciano on 03/07/2024.
//

import Foundation


var loader = ApiHandler(url: "https://jsonplaceholder.typicode.com/todos/")


var myTodo = try! await loader.loadTodo(id: 4)

print(myTodo!)

myTodo = try! await loader.loadTodo(id: 5)

print(myTodo!)
