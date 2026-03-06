class LinkNode {
int data;
LinkNode next;    
LinkNode(int nodeVal)
{
    this.data = nodeVal;
    this.next = null;
}

public void showNodes()
{
    LinkNode n = this;
    while (n !=null) {
        System.out.print(n.data + "->"); 
        n = n.next;       
    }
    System.out.println("null");
}
}

public class LinkList {
    public static void main(String args[])
    {
        System.out.println("Hii this is logs here");
        LinkNode n1 = new LinkNode(10);
        n1.next = new LinkNode(20);
        n1.next.next = new LinkNode(30);
        n1.next.next.next = new LinkNode(40);
        n1.next.next.next.next = n1;
        n1.showNodes();

    }
}