lista = [42, 66, 29, 99, 97,
         98, 90, 7, 45, 46,
         87, 12, 123, 1241, 1231,
         121,341,3941,1451,3145,
         42, 66, 29, 99, 97,
         98, 90, 7, 45, 46,
         87, 12, 123, 1241, 1231,
         121,341,3941,1451,3145]

print(lista)

comp = 0
for j in lista:
    for i in range(len(lista)-1):
        comp += 1
        if lista[i] > lista[i+1]:
            lista[i], lista[i+1] = lista[i+1], lista[i]



print(comp)
print(lista)

"""

90 - 10
110 - 11
132 - 12
210 - 15 
380 - 20 
1560 - 40 - 4x
"""


"""
a = 10
b = 20

print(f"a: {a}")
print(f"b: {b}")

b, a = a, b

aux = a
a = b
b = a



print(f"a: {a}")
print(f"b: {b}")


"""














