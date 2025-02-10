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
        new_list = LinkedList()
        while tmp:
            new_list.addAtBegining(tmp.data)
            tmp = tmp.next
        
        # new_list.printList()
        return new_list
    
    def removeDuplicacy(self):
        tmp = self.head
        while tmp.next:
            if tmp.data == tmp.next.data:
                print(f"Yes this is duplicate node {tmp.data} so removing one duplicate node")
                tmp.next = tmp.next.next
                return
            tmp = tmp.next
            
            
        
l1 = LinkedList()
l1.addAtBegining(0)
l1.addAtBegining(10)
l1.addAtBegining(20)
l1.addAtBegining(20)
l1.addAtBegining(40)
l1.addAtBegining(50)
l1.addAtBegining(60)
l1.deleteNodeAtEnd()
l1.printList()
reversed_new_list = l1.reverseList()
print("List After Reverse")  
reversed_new_list.printList()
print("Old List")
l1.printList()
l1.removeDuplicacy() 
print("After Removing Duplicate")
l1.printList()
