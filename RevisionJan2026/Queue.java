public class Queue{
     public class InnerQueue {
        int data;
        InnerQueue front= null;
        InnerQueue rear = null;
        
        InnerQueue(int data)
        {
            this.data = data;
        }
        
     }

    Queue()
    {
        System.out.println("Constructor of class Queue");
    }

    public static void main(String [] args)
    {
        System.out.println("!!! JAI SHREE RAM !!!");
        System.out.println("Queue is also a linear data stricture. Which works on FIFO (First In First Our");
    }

    static void addValInQueue(InnerQueue ref, InnerQueue newNode)
    {
        
    }
}