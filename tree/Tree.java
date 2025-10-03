class TreeeNode{
    int head;
    TreeeNode left;
    TreeeNode right;

    TreeeNode(int data){
        this.head = data;
        this.left = this.right = null;
    }

    public void printTree()
    {
        System.out.println("printing the tree nodes");
        System.out.println(("Head >"+ this.head));
        if (this.left != null) {
          System.out.print("Left Node ->"+this.left.head);

        } else
        {
        System.out.print("Left Node -> Null");
        }
        if(this.right != null )
        {
         System.out.println("rightt Node ->"+this.right.head);  
        } else
        {
                    System.out.println("rightt Node -> null");

        }
    }


}
public class Tree {
    public static void main(String [] args)
    {
        System.out.println("!! ....  Coding Mode On...... !!");
        TreeeNode t1 = new TreeeNode(10);
        TreeeNode t2 = new TreeeNode(20);
        TreeeNode t3 = new TreeeNode(30);
        TreeeNode t4 = new TreeeNode(40);
        TreeeNode t5 = new TreeeNode(50);

        t1.left = t2;
        t1.right = t3;

        t1.printTree();
    }
}