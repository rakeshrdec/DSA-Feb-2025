class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class QueueLinkedListRevision2025Oct06 {
    
    Node front, rear = null;

    public void Enqueue(int data)
    {
        Node newlyAddedNode = new Node(data);
        if (front == null || rear == null)
        {            
            front = newlyAddedNode;
            rear = newlyAddedNode;
            front.next = rear;
            rear.next = rear;
            return;
        }
        rear = rear.next;
        rear.next = newlyAddedNode; 

    }

    public int Dequeue()
    {
        if(front == null)
        {
            System.out.println("Queue Empty...!");
            return -1;
        }
        int topVal = front.data;
        front = front.next;
        return topVal;
    }
    public static void main(String [] args)
    {
        System.out.println("HK... ! Coding mode started ");

        QueueLinkedListRevision2025Oct06 q = new QueueLinkedListRevision2025Oct06();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        q.Enqueue(40);
        System.out.println(q.Dequeue());
        q.Enqueue(40);
        System.out.println(q.Dequeue());
        q.Enqueue(40);
        System.out.println(q.Dequeue());
    }    
}
