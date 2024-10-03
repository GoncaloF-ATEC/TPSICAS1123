from node import Node

class ListaLigada:

    def __init__(self, head:Node = None, tail:Node = None):
        self.head = head
        self.tail = tail
    """"
    def add_node(self, node:Node):
        if self.head == None:
            self.head = node
            node.next = self.tail
    """

