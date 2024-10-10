
class Node:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

    def __str__(self):
        return str(self.value)


class Tree:

    def __init__(self):
        self.root = None

    def add(self, value):

        # FIXME: garantir que nao posso adicionar nodes com value a None
        # garantir que nao posso adicionar nodes com value a None

        node = Node(value)

        if self.root is None:
            self.root = node

        # TODO:

    def find(self, value):
        pass
