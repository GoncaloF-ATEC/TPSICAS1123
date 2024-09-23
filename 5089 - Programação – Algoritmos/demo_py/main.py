#cmt

"""
cmt
cmt
cmt

"""
from operator import contains

from skimage.data import brain

'''
cmt
cmt
cmt

'''

# var

nome = "valor"
print(nome)

nome = "novo Valor"
print(nome)

nome = 192
print(nome)

myBool = True

nome = "Gonçalo"
print("V1 - ola, " + nome)
print("v2 - ola,", nome)
print(f"v3 - ola, {nome}")

# tuplos
print("------tuplos-----")
tup = (1, 2, 3)
print(tup)
print(tup[0])

# tup[0] = 41 <- em py 'tuple' object does not support item assignment


print(tup.__contains__(3))
print(tup.__contains__(342))
print("--" * 5)
print(contains(tup, 3))
print(contains(tup, 233))

print(tup.__len__())
print(len(tup))

#range

# 0...10 <- 0 a 10

# range(lb, up, s) <- lb ate up-1 com step de s

range(10) # = range(0, 10)

range(5,10)

range(5,10, 2)
print("--"*5, "for","--"*5)
# for

for i in range(6, 50, 5):
    print(i)

print("Fim do for")

# while
print("--"*5, "while" ,"--"*5)
num = 20

while num > 0:
    print(num)
    num -= 1

"""
num -= 1  <-> num = num - 1
num += 1  <-> num = num + 1
num *= 1  <-> num = num * 1
num /= 1  <-> num = num / 1

"""
# if
print("--"*5, "if - else" ,"--"*5)


num  = 103
if num == 10:
    print("num == 10")
else:
    print("num != 10")



print("--"*5, "if - else if " ,"--"*5)

if num == 10:
    print("num == 10")

elif num == 5:
    print("num == 5")

else:
    print("num != 10")


print("--"*5, "if - and / or " ,"--"*5)

num = 5
if num == 10 or num == 5:
    print("num == 10 ou num== 5")


num2 = 5222
num = 5


if (num == 10 and num2 == 5) or num == 5 :
    print("num == 10 e  num2 == 5")
else:
    print("outro valor")

# 'switch' <- py 3.10
print("--"*5, "switch - match  " ,"--"*5)

num = 0
match num:
    case 0:
        print("0")
    case 1:
        print("1")
    case 2:
        print("2")
    case _:
        print("outro valor")





print("--"*5)

for i in range(10000):
    if i % 10 == 0:
        continue


    print(i)
    if i == 25:
        break


res = 10 / 3
print(res)

res = 10 // 3  # -> div inteira
print(res)
