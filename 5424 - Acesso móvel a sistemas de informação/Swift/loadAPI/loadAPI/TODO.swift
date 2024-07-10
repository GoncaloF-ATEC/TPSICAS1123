//
//  TODO.swift
//  loadAPI
//
//  Created by Gonçalo Feliciano on 03/07/2024.
//

import Foundation

/*
 
 {
   "userId": 1,
   "id": 1,
   "title": "delectus aut autem",
   "completed": false
 }
 
 */

struct Todo: Codable{
    
    var userId: Int
    var id: Int
    var title: String
    var completed: Bool
    
}
