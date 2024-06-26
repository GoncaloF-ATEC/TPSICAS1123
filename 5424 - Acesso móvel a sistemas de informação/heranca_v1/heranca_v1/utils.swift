//
//  utils.swift
//  heranca_v1
//
//  Created by Gonçalo Feliciano on 26/06/2024.
//

import Foundation


extension Array{
    
    func calcMedia() -> Double{
        
        var sum = 0
        
        for i in self{
            if i is Int{
                var aux = i as! Int
                sum += aux
            }
        }

        return Double(sum) / Double(self.count)
    }
}

extension Array<Int>{
    
    func calcMediaV2() -> Double{
        
        var sum = 0
        
        for i in self{
            sum += i
        }

        return Double(sum) / Double(self.count)
    }
}

extension String{
    
    static var semDados = "Sem dados"
    
}
