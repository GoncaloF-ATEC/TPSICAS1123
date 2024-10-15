import random as rand
import time as t

myList = []

for i in range(10_000):
    myList.append(rand.randint(0,100))


def findSeq(x:int, lista:list) -> int:
    for i in range(lista.__len__()):
        if x == lista[i]:
            return i
    return None


def findSeqv2(x:int, lista:list) -> int:
    for index, val in enumerate(lista):
        if x == val:
            return index
    return None





print(findSeq(50, myList))
print(findSeqv2(50, myList))



