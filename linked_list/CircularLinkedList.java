class Node {
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next =null;
    }

    public void displayNode()
    {
        System.out.println("Printing data of the node :"+this.data);
    }

    public void printAllNodes()
    {
        Node firstNode = null;
        Node currentNode = this;
        do {
            System.out.print(currentNode.data+"-->");
            currentNode = currentNode.next;
            firstNode = this;
        } while (currentNode != firstNode);

        System.out.println(currentNode.data);
    }

}

public class CircularLinkedList {
    public static void main(String [] args)
    {
        System.out.println("HK...!");
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.displayNode();
        n2.displayNode();
        n3.displayNode();
        n4.displayNode();
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;
        n1.printAllNodes();
        // System.out.print()
    }
}