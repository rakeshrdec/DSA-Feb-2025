public class QueueArrayRevision2025Oct06 {
    int queue [] = new int[15];
    int front = -1;
    int rear = -1;

    public void Enqueue(int val)
    {
        if(rear == queue.length)
        {
            System.out.println("Sytem Queue reached it's peak so no more insert allowed");
            return;
        }
        if (front == -1 || rear == -1)
        {
            front++;
            rear++;
            queue[front] = val;
            return;
        }
        rear++;
        queue[rear] = val;
        return;
    }

    public int Dequeue()
    {
        if(front == rear)
        {
            System.out.println("System Queue Reched it's limit");
            return -1;
        }
        int frontVal = queue[front];
        front++;
        return frontVal;
    }
    public static void main(String[] args) {
        System.out.println("HK..! Coding MOde Started");
        QueueArrayRevision2025Oct06 q1 = new QueueArrayRevision2025Oct06();
        q1.Enqueue(10);
        q1.Enqueue(20);
        q1.Enqueue(30);
        System.err.println(q1.Dequeue());
    }
}