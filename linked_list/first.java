public class first {
    int data;
    first next;

    public first(int data) {
        this.data = data;
        this.next = null;
    }

    public void display() {
    System.out.print(data + " ");
    }

    public static void main(String [] args)
    {
        System.out.print("HK !, We have started our revision agauin !! \n");
        first f1 = new first(10);
        first f2 = new first(20);
        first f3 = new first(30);
        f1.display();
        f2.display();
        System.out.println("Hey lets start printing another linked list in sequence");
        // Upto here we have generated the nodes now we will chain/attach these nodes inthe 
        f1.next = f2;
        f2.next = f3;
        f3.next = null;

        // Linked lsit created now, i will print the new linked list
        first current = f1;
        while (current != null)
        {
            
            current.display();
            System.out.print("==> ");
            current = current.next;        
        }
        System.out.print("Null");
    }

}