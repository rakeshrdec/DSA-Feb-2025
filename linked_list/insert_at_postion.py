class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
    
class LinkedList:
    def __init__(self):
        self.head = None
        
    def insertAtBegin(self, data):
        new_node = Node(data)
        
        if self.head is None:
            self.head = new_node
            return
        else:
            new_node.next = self.head
            self.head = new_node
            
    def insertAtLoc(self, data, index):
        if self.head is None:
            print("Already list is empty. !...Going to insert at begining of the array")
            return self.insertAtBegin(data)
        else:
            new_node = Node(data)
            pos = self.head
            for i in range(1,index):
                if pos is not None:                    
                    pos = pos.next
                else:
                    print(f"There is no index available upto {i}...! So will add at the end")
                    return
            
            new_node.next = pos.next
            pos.next = new_node
                
    
    def printList(self):
        if self.head is None:
            print("No Element in linked list to print")
        else:
            tmp = self.head
            while tmp:
                print(tmp.data, end=" => ")
                tmp = tmp.next
            print("None")
            
            
l1 = LinkedList()
l1.insertAtBegin(10)
l1.insertAtBegin(20)
l1.insertAtBegin(30)
l1.insertAtBegin(50)
l1.insertAtBegin(60)
l1.insertAtBegin(70)

l1.insertAtLoc(40,30)
l1.printList()