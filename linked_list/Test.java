class n {
    int d;
    n next;

    public n(int d)
    {
        this.d = d;
        this.next = null;
    }

    public void display()
    {
        System.out.println("Starting printing ");
        n current = this;
        while (current.next != null) {
            System.out.print(current.d);
            System.out.print("-->");
            current = current.next;
        }        
    }
}
public class Test {
    public static void main(String[] args)
    {
        System.out.println("HK:... " );
        n n1 =new n(10);
        n n2 = new n(20);
        n n3 = new n(30);
        n n4 = new n(40);
        // n1.next = new n(20);
        n3.next = n4;
        n2.next = n3;
        n1.next = n2;
        n1.display();
    }
}
