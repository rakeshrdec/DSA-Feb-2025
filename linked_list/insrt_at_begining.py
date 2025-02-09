class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None  # Initially, the list is empty
        
    def insertAtBegin(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        else:
            new_node.next = self.head
            self.head = new_node

    def printList(self):
        temp = self.head
        while temp:
            print(temp.data , end="=>")
            temp = temp.next
        print("None")
        

l1 = LinkedList()
l1.insertAtBegin(10)
l1.insertAtBegin(20)
l1.insertAtBegin(30)

l1.printList()    

