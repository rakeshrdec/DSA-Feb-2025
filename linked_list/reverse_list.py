class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
    
    
class LinkedList:
    def __init__(self):
        self.head = None
        
    
    def addAtBegining(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        
    def deleteNodeAtEnd(self):
        if self.head is None:
            print("No Elements to delete")
        tmp = self.head
        while tmp.next.next:
            tmp = tmp.next
        # tmp = None
        tmp.next = None

    def printList(self):
        tmp = self.head
        while tmp:
            print(tmp.data, end=" => ")
            tmp = tmp.next
        print("None")
        
    def reverseList(self):
        tmp = self.head
        if tmp:
            print(tmp.data)
            
            
        
l1 = LinkedList()
l1.addAtBegining(10)
l1.addAtBegining(20)
l1.addAtBegining(30)
l1.deleteNodeAtEnd()
l1.printList()