public class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}
public class QueueWithLinkedList {
    Node front, rear;

    QueueWithLinkedList()
    {
        front = rear = null;
    }

    public Enqueue(int data)
    {
        if(front==null || rear == null)
        {
            rear.data = data;
            rear.next = null;
            front.data = data;
            front.next = rear;
            return;
        }

        // rear.
    }
    public static void main(String [] args)
    {
        System.out.println("HK ... ! ..Coding mode truend on.. ");
    }
}