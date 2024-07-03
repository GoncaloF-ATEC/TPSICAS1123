//
//  ApiHandler.swift
//  loadAPI
//
//  Created by Gonçalo Feliciano on 03/07/2024.
//

import Foundation


class ApiHandler{
    
    var url: URL
    
    
    init(url: String) {
        self.url = URL(string: url)!
    }
    
    
    
    
    //https://jsonplaceholder.typicode.com/todos/2
    func loadTodo(id: Int) async throws-> Todo?{
        self.url.append(component: "\(id)" )
        
        var req = URLRequest(url: self.url)
        
        let (data, resp) = try await URLSession.shared.data(for: req)
        
        guard let resp = resp as? HTTPURLResponse, (200...299).contains(resp.statusCode) else{
            print("erro")
            
            return nil
            
        }
        
        var myData = try JSONDecoder().decode(Todo.self, from: data)
        
        self.url.deleteLastPathComponent()

        return myData
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
