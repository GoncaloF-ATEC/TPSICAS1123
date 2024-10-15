import random as r




"""
P = 1
R = 2 
S = 3


"""


n1 = 0
n2 = 0
n3 = 0
par = 0
inpar = 0
min_new = 1
max_new = 3
min_orig = 1
max_orig = 30000000000

for i in range(0,1_000_000):
    valA = r.randint(min_orig,max_orig)

    #valA = ((valA - min_orig) / (max_orig - min_orig)) * (max_new - min_new) + min_new

    if valA % 2 == 0:
        par += 1
    else:
        inpar += 1


    if valA == 1:
        n1 += 1

    if valA == 2:
        n2 += 1

    if valA == 3:
        n3 += 1


print(f"""
n1: {n1}
n2: {n2}
n3: {n3}
------
impar: {inpar}
par: {par}
""")