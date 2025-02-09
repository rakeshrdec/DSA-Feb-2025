class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
        

# Creating nodes
node1 = Node(10)
node2 = Node(20)
node3 = Node(30)


# Linking nodes
node1.next = node3
node3.next = node2


# Traversing the linked list
current = node1
while current:
    print(current.data, end=" -> ")
    current = current.next
print("None")