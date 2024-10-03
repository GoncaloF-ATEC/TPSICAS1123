
class Aluno:
    teste: int = 99

    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
        self.teste = 10

    def inscrever(self, curso):
        print(f"o aluno esta inscrito no curso {curso}")

    def __str__(self):
        return f'ola Mundo :)'

    def __eq__(self, other):
       return  self.nome == other.nome

    def __ne__(self, other):
        return self.idade != other.idade

    def __gt__(self, other):
        return self.idade > other.idade

    def __add__(self, other):
        self.idade += other

    def __le__(self, other):
        return self.idade <= other.idade



class Professor:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade





al2 =  Aluno("Gonçalo", 22)

al2.inscrever("TPSI")

# print(al.turma)
#print(al2.turma)

al = Aluno("Gonçalo", 39)
f = Professor("Gonçalo", 20)

print(al == f)
print(al != f)
print(al)
print(al.__dict__)