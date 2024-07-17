//
//  ApiHandler.swift
//  loadAPI
//
//  Created by Gonçalo Feliciano on 03/07/2024.
//

import Foundation


typealias TODOs = [Todo]

enum  myError: Error{
    
    case respostaInvalida
}

class ApiHandler{
    
    var url: URL
    
    
    init(url: String) {
        self.url = URL(string: url)!
    }
    
    
    
    
    //https://jsonplaceholder.typicode.com/todos/2
    func loadTodo(id: Int) async throws-> Todo?{
        self.url.append(component: "\(id)" )
        
        let req = URLRequest(url: self.url)
        
        let (data, resp) = try await URLSession.shared.data(for: req)
        
        guard let resp = resp as? HTTPURLResponse, (200...299).contains(resp.statusCode) else{
            print("erro")
            
            throw myError.respostaInvalida
        }
        
        let myData = try JSONDecoder().decode(Todo.self, from: data)
        
        self.url.deleteLastPathComponent()

        return myData
    }
    
    
    //https://jsonplaceholder.typicode.com/todos
    func loadAllTodo() async throws-> TODOs?{
        
        let req = URLRequest(url: self.url)
        
        let (data, resp) = try await URLSession.shared.data(for: req)
        
        guard let resp = resp as? HTTPURLResponse, (200...299).contains(resp.statusCode) else{
            print("erro")
            
            throw myError.respostaInvalida
        }
        
        let myData = try JSONDecoder().decode(TODOs.self, from: data)
        

        return myData
    }
    
    
    let semaphore = DispatchSemaphore(value: 0)
    
    func fetchPostkWith(id:Int, completion: @escaping (Todo) -> Void){
           
           url.append(component: "\(id)")
      //     url.appendPathComponent("\(id)")
           
           let dataTask = URLSession.shared.dataTask(with: url) { data, resp, erro in
               
               if let erro = erro {
                   print("Erro: \(erro.localizedDescription)")
               }
               
               guard let resp = resp as? HTTPURLResponse, (200...299).contains(resp.statusCode) else {
                   
                   print("resposta invalida")
                   return
               }
               
               if let dados = data, let dados = try? JSONDecoder().decode(Todo.self, from: dados){
                   completion(dados)
                   self.semaphore.signal()
               }
           }
           
               dataTask.resume()
                
                semaphore.wait()
            
               url.deleteLastPathComponent()
       }
    
    
    func loadTodokWith(todo:Todo, completion: @escaping (Todo) -> Void){
        
        
        var url = URLRequest(url: URL(string:"https://jsonplaceholder.typicode.com/posts")!)
        
        let myData = try! JSONEncoder().encode(todo)
                
        url.httpMethod = "post"
        
        url.setValue("application/json", forHTTPHeaderField: "Content-Type")

        url.httpBody = myData
        
        
        
        
    
           
           let dataTask = URLSession.shared.dataTask(with: url) { data, resp, erro in
               
               if let erro = erro {
                   print("Erro: \(erro.localizedDescription)")
               }
               
               guard let resp = resp as? HTTPURLResponse, (200...299).contains(resp.statusCode) else {
                   
                   print("resposta invalida")
                   return
               }
               
               if let dados = data, let dados = try? JSONDecoder().decode(Todo.self, from: dados){
                   completion(dados)
                   self.semaphore.signal()
               }
           }
           
               dataTask.resume()
                
                semaphore.wait()
        
       }
 
    
}

/*
 1
 2
 3
 4  4.1
 5  4.2
 6  4.3
 7  4.4
 8
 
 */
