# Methods Gonna use here
# Push | Pop | Peek | isEmpty | size
# Stack work on LIFO architecture(Last IN First Out)

class Stack:
    def __init__(self):
        self.stack = []
        
    def push(self, data):
        self.stack.append(data)
        
    def pop(self):
        self.stack.pop()
        
    def peek(self):
        # THis FUnction will return the first item from the top         
        if self.is_empty():
            return "Stack is empty"
        else:
            return self.stack[-1]
        
    def is_empty(self):
        return len(self.stack) == 0  # Check if stack is empty
    
    def size(self):
        return len(self.stack)
    

s = Stack()
s.push(8)
s.pop()
s.push(6)
s.push(7)
s.push(100)

print("Length of the stack",s.size())
s.pop()
print("Last Element of the Staco",s.peek())