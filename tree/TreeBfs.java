class Node {
    TreeNode data;
    Node next;

    Node(TreeNode data){
        this.data = data;
        this.next = null;
    }
}

class QueueRevision {
    Node front, rear;

    QueueRevision() {
        this.front = this.rear = null;
    }

    public void enqueue(TreeNode data) {
        if(data == null) return; // avoid null nodes
        Node n = new Node(data);
        if(this.rear == null) { // queue is empty
            this.front = this.rear = n;
        } else {
            this.rear.next = n;
            this.rear = n;
        }
    }

    public TreeNode dequeue() {
        if(this.front == null) return null;
        TreeNode returnData = this.front.data;
        this.front = this.front.next;
        if(this.front == null) this.rear = null; // queue is empty now
        return returnData;
    }

    public boolean isEmpty() {
        return this.front == null;
    }
}

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int data) {
        this.val = data;
        this.left = this.right = null;
    }

    public void printNode() {
        System.out.print(this.val + " ");
    }
}

public class TreeBfs {

    public static void BFS(TreeNode root) {
        if(root == null) return;

        QueueRevision queue = new QueueRevision();
        queue.enqueue(root);

        while(!queue.isEmpty()) {
            TreeNode current = queue.dequeue();
            current.printNode();

            // Enqueue children
            if(current.left != null) queue.enqueue(current.left);
            if(current.right != null) queue.enqueue(current.right);
        }
    }

    public static void main(String[] args) {
        // Constructing Tree
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

        t1.left = t2;
        t2.left = t3;
        t3.left = t4;
        t1.right = t5;
        t2.right = t6;
        t3.right = t7;
        t4.left = t8;
        t8.left = t9;
        t6.right = t10;
        t10.right = t11;

        System.out.println("Breadth First Search (Level Order):");
        BFS(t1);
    }
}
