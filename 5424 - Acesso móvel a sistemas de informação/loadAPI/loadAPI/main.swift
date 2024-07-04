//
//  main.swift
//  loadAPI
//
//  Created by Gonçalo Feliciano on 03/07/2024.
//

import Foundation


var loader = ApiHandler(url: "https://jsonplaceholder.typicode.com/todos/")


//var myTodo = try! await loader.loadTodo(id: 4)

//print(myTodo!)

//myTodo = try! await loader.loadTodo(id: 5)

//print(myTodo!)


//var allTodo = try! await loader.loadAllTodo()

// print(allTodo![9])




loader.fetchPostkWith(id: 8) { todo in
    print("--------------------")
    print(todo)
}
print("--------------------")




var todo = Todo(userId: 99, id: 99, title: "txt base", completed: false)

loader.loadTodokWith(todo: todo) { todo in
    print("-------adicionado-------------")
    print(todo)
}
print("--------------------")
