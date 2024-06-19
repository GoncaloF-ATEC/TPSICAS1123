//
//  Quadrado.swift
//  classesV2
//
//  Created by Gonçalo Feliciano on 19/06/2024.
//

import Foundation


class Quadrado{
        
    private var _lado: Double{
        
        willSet{
            print("o valor de _lado é \(self._lado) e vai mudar para: \(newValue)")
        }
        
        didSet{
            print("o valor de _lado era \(oldValue) mas mudou para: \(_lado)")
            
        }
    }
    

    var lado: Double{
        
        get{
           return self._lado
        }
        
        set{
            self._lado = newValue
        }
    }
    
    
    
    var area: Double{
        get{
            self._lado * self._lado
            
        }
        
        set{
            self._lado = sqrt(newValue)
        }
    }
    
    var perimetro: Double{
        get{
            self._lado * 4
        }
        
        set{
            self._lado =  newValue / 4
        }
    }
    
    
    
    
    
    
    init(lado: Double) {
        self._lado = lado
    }
    
    
  
    
    
}
