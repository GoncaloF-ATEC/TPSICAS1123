import modeloDados as model

p1 = model.Pessoa("Carlos", 18)
al = model.Aluno("Rita", 27, "TPSICAS")

print(p1)
print(al)

listaUFCDs = [5089, 10794, 10795]

prof2 = model.Professor("João", 40,listaUFCDs)
prof3 = model.Professor("Maria", 23,listaUFCDs)

print(f"prof2: {prof2.turmas}")
print(f"prof3: {prof3.turmas}")

prof2.adicionar_turma(11015)

print(f"prof2: {prof2.turmas}")
print(f"prof3: {prof3.turmas}")


prof5 = prof3

prof5.nome = "Sem nome"



print("---" * 4)

prof5.portect()
print(prof5._metodoProtrct)
# print(prof5.__metodoPvt)

print(p1._metodoProtrct)


lista = [p1, al, prof2]

for elm in lista:
    
    elm.msg()