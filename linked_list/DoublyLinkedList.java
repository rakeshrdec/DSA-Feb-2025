class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data)
    {
        // Constructor
        this.data = data;
        this.prev = null;
        this.next = null;        
    }

    public void displayNode()
    {
        System.out.println("Displaying current node");
        System.out.print("<--");
        System.out.print(this.data);
        System.out.println("-->");
    }
}
public class DoublyLinkedList {
    public static void printAllNodes(Node startNode)
    {
        Node current = startNode;
        do 
        {
            System.out.print(" <--prev");
            System.out.print(current.data);
            System.out.print("next--> ");
            current = current.next;
        } while (current != null);
    }

    public static void addNewNodeOnLastPos(Node startingNode, Node newNode)
    {
        Node currentNode = startingNode;
        while (currentNode.next !=null)
        {
            System.out.println("Data "+currentNode.data);
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
    }
    public static void main(String [] args)
    {
        System.out.print("HK!... Coding Mode Started ");
        // System.out.println(args[0]);
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        // n2.next = new Node(30);
        n1.displayNode();
        n2.displayNode();
        n3.displayNode();
        Node n4 = new Node(40);
        addNewNodeOnLastPos(n1,n4);
        printAllNodes(n1);

    }
}