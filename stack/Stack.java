// Stack is Last In First Out (LIFO), Linear DataStructure
public class Stack{
    int maxStackSize;
    int stack [];
    int top;

    public Stack(int size)
    {
        this.maxStackSize = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public void push(int value)
    {
        if(top==maxStackSize-1)
        {
            System.out.println("Stack is overfow... All spaces in this stack occupied");
            return;
        }else
        {
            stack[++top] = value;
        }
    }

    public void peek()
    {
        System.out.print("Top element of the stack is =>");
        System.out.println(stack[top]);
    }

    public void pop()
    {
        if(top == -1)
        {
            System.out.println("No elements presents in stack to remove");
            return;
        }
        else
        {
            // stack[top] This is the element is going to remove may be you can return this asper need
            top--;
            return;
        }

    }

    public static void main(String [] args)
    {
        Stack s = new Stack(20);
        s.push(10);
        s.push(30);
        s.peek();
        s.push(13989);
        s.peek();
        s.pop();
        s.peek();
    }
}