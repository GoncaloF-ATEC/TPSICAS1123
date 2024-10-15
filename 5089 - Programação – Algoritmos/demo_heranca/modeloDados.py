class Pessoa:
    def __init__(self, nome: str, idade: int):
        self.nome = nome
        self.idade = idade


    def envelhecer(self):
        self.idade += 1


    def __str__(self):
        return f'tipo:{type(self)} Nome: {self.nome}, Idade: {self.idade}'



class Aluno(Pessoa):
    def __init__(self, nome: str, idade: int, turma:str):
        self.turma = turma
        super().__init__(nome, idade)


    def envelhecer(self):
        self.idade += 2


class Professor(Pessoa):
    def __init__(self, nome: str, idade: int, turmas:list = []):
        self.turmas = turmas.copy()
        super().__init__(nome, idade)

    def adicionar_turma(self, nova_turma):
        self.turmas.append(nova_turma)

    def envelhecer(self):
        self.idade += 2


    def copy(self):
        pass

