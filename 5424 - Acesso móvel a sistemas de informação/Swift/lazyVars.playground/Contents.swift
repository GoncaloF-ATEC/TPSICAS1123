import Cocoa


class demo{
    
    var nome: String
    var idade: Int
    
    lazy var foo = self.funcComplexa()
    

    init(nome: String) {
        self.nome = nome
        self.idade = 13
    }

    
    func funcComplexa() -> Int {
        
        var count = 0
        
        while (sleep(2) > 0){
            
            count += 1
            
        }
        
       
        return count
    }
    
}



var d = demo(nome: "nome")


print(d.nome)


print(d.foo)



d


print(d.nome)
