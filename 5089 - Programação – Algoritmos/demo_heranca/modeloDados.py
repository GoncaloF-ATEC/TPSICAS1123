class Pessoa:
    def __init__(self, nome: str, idade: int):
        self.nome = nome
        self.idade = idade
        self.__metodoPvt = 0
        self._metodoProtrct = -10

    def envelhecer(self):
        self.idade += 1

    def msg(self):
        print("msg de Pessoa")

    def __str__(self):
        return f'tipo:{type(self)} Nome: {self.nome}, Idade: {self.idade}'



class Aluno(Pessoa):
    def __init__(self, nome: str, idade: int, turma:str):
        self.turma = turma
        super().__init__(nome, idade)

    def envelhecer(self):
        self.idade += 2

    def msg(self):
        print("msg de Aluno")

    def __str__(self):
        return f'Nome: {self._metodoProtrct}, Idade: {self.idade}, Turma: {self.turma}'


class Professor(Pessoa):
    def __init__(self, nome: str, idade: int, turmas:list = []):
        self.turmas = turmas.copy()
        super().__init__(nome, idade)

    def adicionar_turma(self, nova_turma):
        self.turmas.append(nova_turma)

    def envelhecer(self):
        self.idade += 2


    def msg(self):
        print("msg de Professor")

    def portect(self):
        print(self._metodoProtrct)

    def copy(self):
        return Professor(self.nome, self.idade, self.turmas)
