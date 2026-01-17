import java.math.*;

class Node {
    int data;
    Node next;

    Node(int val)
    {
        this.data = val;
        this.next = null;
    }   
    
}


public class LinkList {
    LinkList()
    {
        System.out.println("This is constructor of class LinkList");
    }
    public static void main(String [] args)
    {
        System.out.println("JAI SHREE RAM !!");
        System.out.println("Handlers of all the nodes");
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        addToTheLast(n1,n2);
        addToTheLast(n1, n4);
        addToTheLast(n1, n3);
        printlnAllNodes(n1);

    }
    static void printlnAllNodes(Node refNode)
    {
        while (refNode!=null) {
            System.out.print(refNode.data+"->");
            refNode = refNode.next;            
        }
    }

    static void addToTheLast(Node nodeRef, Node newNode)
    {
        while (nodeRef.next !=null) {
            nodeRef = nodeRef.next;            
        }
        nodeRef.next = newNode;
    }

}