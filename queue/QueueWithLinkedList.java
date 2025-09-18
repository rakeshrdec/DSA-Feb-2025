class Node{
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

    public void Enqueue(int data)
    {
        Node node = new Node(data);
        if(front==null || rear == null)
        {
            rear = node;
            front = node;
            front.next = rear;
            return;
        }
        rear.next = node;
        rear = node;
    }

    public void peekQueue()
    {
        System.out.print("printing the peek element of queue : => ");
        System.out.println(front.data);
    }

    public void  Dequeue()
    {
        System.out.println("Deleting first element from the queue "+front.data);
        front = front.next;
    }
    public static void main(String [] args)
    {
        System.out.println("HK ... ! ..Coding mode truend on.. ");
        QueueWithLinkedList q = new QueueWithLinkedList();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.peekQueue();
        q.Dequeue();
        q.Dequeue();
        q.peekQueue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Dequeue();
        q.peekQueue();
    }
}