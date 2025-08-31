public class QueueArray {
    int front;
    int rear;
    int queueMaxSize;
    int [] queue;

    public QueueArray(int size)
    {
        this.front = -1;
        this.rear= -1;
        this.queueMaxSize = size;
        queue = new int[this.queueMaxSize];
    }

    public void Enqueue(int value)
    {
        System.out.print("Adding one new element in the queue : ");
        System.out.println(value);
        if(this.rear == this.queueMaxSize -1)
        {
            System.out.println("Queue is overflow... can't add new elements in this");
            return;
        }
        // Insert Add an element at the rear (end) of the queue.
        if(this.front == -1)
        {
            this.front = 0;  // Only update front if not removed any items from the start
        }
        queue[++this.rear] = value;
    }

    public void Dequeue()
    {
        System.out.println("Removing first element from the Deque.. and update front");
        if(this.front==-1 || this.front == this.queueMaxSize +1)
        {
            System.out.println("Queue is underflow.. can not remove more element..either all elements have been reoved or not any elements added to queue");
            return;
        }
        this.front++;
    }

    public void peekQueue()
    {
        // See the front element without removing it.
        System.out.print("See the front element without removing it : ");
        if(this.front>-1 && this.front < this.queueMaxSize)
        {
                    System.out.println(queue[this.front]);
                    return;
        }
        else
        {
            System.out.println("Not any elemenst present in Queue to show");
            return;
        }
    }


    public static void main(String [] args)
    {
        System.out.println("HK !... Coding mode Turned On");
        QueueArray q = new QueueArray(10);
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        q.Enqueue(60);
        q.Enqueue(70);
        q.peekQueue();
        q.Dequeue();
        q.peekQueue();
        q.Dequeue();
        q.peekQueue();
        q.Enqueue(80);
        q.Enqueue(90);
        q.Enqueue(100);
        q.Enqueue(110);
        q.Enqueue(120);
        q.peekQueue();
        q.Dequeue();
        q.peekQueue();
        q.Dequeue();
        q.peekQueue();
        q.Dequeue();
        q.Dequeue();
        q.Dequeue();
        q.peekQueue();
        q.Dequeue();
        q.Dequeue();
        System.out.println("This is the last element of queue");
        q.peekQueue();
        q.Dequeue();
        q.peekQueue();
        q.Dequeue();
        q.Dequeue();
        q.Dequeue();
        q.Dequeue();
        q.Dequeue();
        q.peekQueue();
        q.Dequeue();
        q.Dequeue();
        q.Dequeue();
        q.Dequeue();
        q.Dequeue();
        q.Dequeue();
        q.peekQueue();
        
    }
}