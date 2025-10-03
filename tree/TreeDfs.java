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

    public void InOrderPrint()
    {
        // InOrder, (Left Root Right) 
        if(this.Left != null)
        {
         this.Left.InOrderPrint();
        } 
        System.out.print(" "+this.root);
        if (this.right != null) {
            // System.out.print(" "+this.right);
            this.right.InOrderPrint();
        }
        
    }

    public void PreOrderPrint()
    {
        // Preorder (Root → L → R)
        System.out.print(" "+this.root);
        if(this.Left != null)
        {
         this.Left.PreOrderPrint();
        } 
        if (this.right != null) {
            // System.out.print(" "+this.right);
            this.right.PreOrderPrint();
        }
        
    }

    public void PostOrderPrint()
    {
        // InOrder, (Left Root Right) 
        if(this.Left != null)
        {
         this.Left.PostOrderPrint();
        } 
        if (this.right != null) {
            // System.out.print(" "+this.right);
            this.right.PostOrderPrint();
        }
         System.out.print(" "+this.root);
        
    }

}
public class TreeDfs {
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
    System.out.println("IndOder Printing =>");
    t1.InOrderPrint();
    System.out.println(" \n Pre Order Printing");
    t1.PreOrderPrint();
    System.out.println(" \n Post Order Printing");
    t1.PostOrderPrint();
    }
}
