def nome():
    print("Ola Mundo")

def nome2(nome: str, ano: int):
    print(f"Ola Mundo, {nome} em {ano}")

def nome3(nome: str, ano: int) -> str:
   return f"Ola Mundo, {nome} em {ano}"


nome()
nome2(32132,32323)
f = nome3("Gonçalo", 2131)


def sumToMax_recur(max:int) -> int:

    if max == 1:
        return 1
    return max + sumToMax_recur(max-1)



def sumToMax_not_recur(max:int) -> int:
    soma = 0
    for i in range(1, max+1):
        soma += i
    return soma

## factorial_recur

def factorial_recur(val:int) -> int:

    if val == 1:
        return 1

    if val == 0:
        return 1

    return val * factorial_recur(val - 1)



print(sumToMax_recur(5))
print(sumToMax_not_recur(5))

print(factorial_recur(1))