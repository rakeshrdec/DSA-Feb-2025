class  Node {
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class QueueRevision {
    Node front, rear;

    QueueRevision()
    {
        this.rear = this.front = null;
    }

    public void Enqueue(int data)
    {
        Node n = new Node(data);
        if(this.front == null || this.rear == null)
        {
            this.front = this.rear = n;
            this.front.next = this.rear;
            return;
        } else
        {
            // SO here next will keep the record of old node and itself reare will be get updated
            this.rear.next = n;
            this.rear = n;
        }
    }

    public void Dequeue(){
        System.out.println("printing the first element of Queue and after that it will be get updated");
        if(this.front == null)
        {
            System.out.println("No Data available in Queue ... Plese Insert data to process");
            return;
        }
        System.out.println(this.front.data);
        this.front = this.front.next;
    }
    public static void main(String[] args) {
        System.out.println("HK...! Coding Mode started....");
        
        QueueRevision q1 = new QueueRevision();
        q1.Enqueue(10);
        q1.Enqueue(20);
        q1.Enqueue(30);
        q1.Enqueue(40);
        q1.Dequeue();
        q1.Dequeue();
        q1.Dequeue();
        q1.Dequeue();
        q1.Dequeue();
    }    
}
