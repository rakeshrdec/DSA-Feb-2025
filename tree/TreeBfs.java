class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}
class QueueWithLinkedList {
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
}

class TreeNode {
    int root;
    TreeNode Left, right;

    TreeNode(int data)
    {
        this.root = data;
        this.Left = this.right = null;
    }

    public void printCurrentTreeNode()
    {
        System.err.println("Printing current Node Data");
        System.out.println("Root ->"+this.root);
        if(this.Left != null)
        {
          System.out.println("Left ->"+this.Left.root);
   
        } else 
        {
                    System.out.println("Left ->"+"null");
        }
        if (this.right != null) {
        System.out.println("Right ->"+this.right.root);
        }else {
        System.out.println("Right ->"+ " null");
        }

    }

}

public class TreeBfs {
    // DFS (Depth FIrst Search/Traversal)
    // InOrder, (Left Root Right) 
    // PreOrder (Root Left Right)
    // and PostOrder (Left Right Root)
    //          t1
    //         /  \
    // t2
    public static void main(String[] args) {
    TreeNode t1 = new TreeNode(10);
    TreeNode t2 = new TreeNode(20);
    TreeNode t3 = new TreeNode(30);
    TreeNode t4 = new TreeNode(40);
    TreeNode t5 = new TreeNode(50);
    TreeNode t6 = new TreeNode(60);
    TreeNode t7 = new TreeNode(70);
    TreeNode t8 = new TreeNode(80);
    TreeNode t9 = new TreeNode(90);
    TreeNode t10 = new TreeNode(100);
    TreeNode t11 = new TreeNode(110);

    t1.Left = t2;
    t2.Left = t3;
    t3.Left = t4;
    t1.right = t5;
    t2.right = t6;
    t3.right = t7;
    t4.Left = t8;
    t8.Left = t9;
    t6.right = t10;
    // t6.Left = t11;
    t10.right = t11;

    t1.printCurrentTreeNode();
    System.out.println("Bread First Search , Level Order Printing =>");
    // t1.LevelOrderPrinting();    
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
