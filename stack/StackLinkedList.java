class LinkedListNode{
    int data;
    LinkedListNode next;

    public LinkedListNode(int value)
    {
        this.data = value;
        this.next = null;
    };
}

public class StackLinkedList{
    LinkedListNode top;

    public void pushElementInStack(int value)
    {
        LinkedListNode newNode = new LinkedListNode(value);
        newNode.next = top;
        top = newNode;
    }

    public void peekElementInStack()
    {   
        if(top ==  null)
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Peek elemenet in stack is :=> ");
        System.out.print(top.data);
    }

    public void popElementInStack()
    {
        if(top == null)
        {
            System.out.println("Stack is underflow, .. can't remove one more value");
            return;
        }else{
            System.out.print("\n this is the data will be removed from the stack");
            System.out.println(top.data);
            top = top.next;
        }
    }
    public static void main(String [] args)
    {
        StackLinkedList s = new StackLinkedList();
        s.pushElementInStack(10);
        s.pushElementInStack(20);
        s.pushElementInStack(30);
        s.peekElementInStack();
        s.popElementInStack();
        s.peekElementInStack();
        s.pushElementInStack(10);
        s.peekElementInStack();
    }
}