//
//  main.swift
//  Collections
//
//  Created by Gonçalo Feliciano on 05/06/2024.
//

import Foundation

// Dict - key -> Value

var dict: [String: String] = ["key1": "Value 1", "key2": "Value 2", "key3": "Value 2"]

print(dict["key8"])

dict["key8"] = "novo valor"
print(dict["key8"])

print(dict)

dict["key8"] = nil

print(dict)

print(dict.keys)
print(dict.values)

print(dict.isEmpty)

//dict.removeAll()

/*
var val = dict.removeValue(forKey: "key17")
print(dict)
print(val)
*/
for elm in dict.keys{
    print(elm)
}

// Set

print("----------Set-----------")

var set1:Set = ["Val1",  "Val2", "Val3"]

print(set1.capacity)

let valSet = set1.insert("Val1")

print("resp: \(valSet.memberAfterInsert)")
print(set1)

print(set1.capacity)


for elm in set1{
    print(elm)
}

print("------------")
let valSet2 = set1.insert("Val11")
print(set1)
set1.remove("Val11")
print(set1)

print(set1.contains("Val11"))



var set2:Set = ["Val1",  "Val2", "Val3"] // val1
var set3:Set = ["Val4",  "Val3", "Val2"] // val4

print("------------")

print(set3.subtracting(set2))
print(set2.subtracting(set3))


print(set2.union(set3))
print(set3.union(set2))

print(set3.intersection(set2))


print(set3.symmetricDifference(set2))



//var set2:Set = ["Val1",  "Val2", "Val3"] // val1
var set4:Set = ["Val1",  "Val2", "Val3", "Val4",  "Val5", "Val6"]

print("---")
print(set4.isSubset(of: set2))
print(set2.isSubset(of: set4))

print("---")
print(set4.isSuperset(of: set2))
print(set2.isSuperset(of: set4))


print(set4.randomElement())


// Arrays MD ("matirzes")
