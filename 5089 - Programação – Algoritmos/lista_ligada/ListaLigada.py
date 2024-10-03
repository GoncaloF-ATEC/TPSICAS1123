from node import Node

class ListaLigada:

    def __init__(self, head = None,):
        self.head = head
        self.tail = head

    def addNodeHead(self,data):
        new_node = Node(data) # Crio um node
        new_node.next = self.head # faço o next no novo node apontar para o inicio da lista
        self.head = new_node # faço o head (inicio da lista) ficar a apontar para o novo node

        if self.tail is None: #se o tail estiver vazio, ou seja se a lista estiver vazia
            self.tail = new_node  # faço o tail (fim da lista apontar para o novo node )



    def addNodeTail(self,data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node


    def addNodeAfter(self,data, new_data):
        pass

    def find_node(self, data) -> Node:
        pass

    def isEmpty(self):
        pass


    def contains(self, data):
        pass


    def get_last_node(self) -> Node:
        pass

    def printLista(self):
        curr = self.head
        while curr is not None:
            print(curr.data)
            curr = curr.next