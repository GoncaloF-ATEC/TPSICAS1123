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
print(prof3)