public class LinkedNode{
    int data;
    LinkedNode next;
    public LinkedNode(int data)
    {
        this.data = data;
        this.next = null;
    };

    public void displayNode()
    {
        System.out.print(this.data+"==>");
    };

    public void printLinkedList()
    {
        LinkedNode current = this;
        while(current != null)
        {
            current.displayNode();
            current = current.next;
        }
        System.out.println("null");
        // Printed all the nodes of linked list via Iteration 
    }

    public void addNodeAtTheEnd(int newData)
    {
        int valueTobeAdded = newData;
        LinkedNode current = this;
        while(current != null)
        {
            if(current.next == null)
            {
                LinkedNode newNode = new LinkedNode(valueTobeAdded);
                newNode.displayNode();
                current.next =  newNode;
                break; // Break the while loop here only
            }
            else
            {
            current = current.next;
            }
        }        
    }

    public void deleteNodeFromGivenPositon(int position)
    {
        LinkedNode current = this; //Assign object of current linked list by which will remove the node at given position
        LinkedNode nodeBeforPos = null;
        for(int i = 1; i<=position; i++)
        {
            if(i == position-1)
            {
                System.out.print("Assined new node vale befor position");
                nodeBeforPos = current;
            }

            if(current==null)
            {
                System.out.println("Linked list crossed its length.. value can't be deleted");
                return;
            }
            else{            
                current = current.next;
            }
        }
        System.out.println("Nod after postion ");
        current.displayNode();
        System.out.println("Node before positon ");
        nodeBeforPos.displayNode();
        LinkedNode nodesAfterPos = current;     
        nodeBeforPos.next = nodesAfterPos;
    }

    public void AddNodeAtGivenPositon(int position, int newVal)
    {
        LinkedNode current = this; //Assign object of current linked list by which will remove the node at given position
        LinkedNode nodeBeforPos = null;
        for(int i = 1; i<=position; i++)
        {
            if(i == position-1)
            {
                nodeBeforPos = current;
            }

            if(current==null)
            {
                System.out.println("Linked list crossed its length.. value can't be deleted");
                return;
            }
            else{            
                current = current.next;
            }
        }
        System.out.println("Node after postion ");
        current.displayNode();
        System.out.println("Node before positon ");
        nodeBeforPos.displayNode();
        LinkedNode nodesAfterPos = current;
        LinkedNode tmpNode = nodeBeforPos.next;    
        nodeBeforPos.next = new LinkedNode(newVal);
        nodeBeforPos = nodeBeforPos.next;
        nodeBeforPos.next = tmpNode;
    }

    public static void main(String [] args)
    {
        System.out.println("HK !.. Coding mode started!!");
        LinkedNode n1 = new LinkedNode(10);
        LinkedNode n2 = new LinkedNode(20);
        LinkedNode n3 = new LinkedNode(30);
        LinkedNode n4 = new LinkedNode(40);
        LinkedNode n5 = new LinkedNode(50);
        LinkedNode n6 = new LinkedNode(60);
        LinkedNode n7 = new LinkedNode(70);
        // Created 3 noded of linked list
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;
        System.out.println("Attached all the three noded and converted in to linked list");
        n1.printLinkedList();
        System.out.println("This method will print all the noded from n1 to ");
        n1.addNodeAtTheEnd(40);
        System.out.println("Adding a new elelement at the end in the above linked list");
        n1.printLinkedList();
        n1.deleteNodeFromGivenPositon(5);
        System.out.println("Deleted one node at the given postion");
        n1.printLinkedList();
        n1.AddNodeAtGivenPositon(3,100);
        n1.printLinkedList();
        System.out.println("Added new node at given position");
        }
}