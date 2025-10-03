public class TreeFirst {
    int root;
    TreeFirst left, right;

    TreeFirst(int root)
    {
        this.root = root;
        this.left = null;
        this.right = null;
    }

    public static void preOrderTreeTraversal(TreeFirst t)
    {
        //  preorder means visiting rule is -> left , root(root) , right
        if (t == null) {
            // System.out.println("Null");
            return;
        }        
        System.out.print(t.root+"->");
        preOrderTreeTraversal(t.left);
        preOrderTreeTraversal(t.right);
    }

    public static void main(String[] args) {
        System.err.println("HK...! Coding Mode Started");
        TreeFirst t1 = new TreeFirst(10);
        TreeFirst t2 = new TreeFirst(20);
        TreeFirst t3 = new TreeFirst(30);
        t1.left = t2;
        t1.right = t3; 
        t3.right = new TreeFirst(80);
        t3.right.right = new TreeFirst(0);
        t3.left = new TreeFirst(120);
        t3.left.left = new TreeFirst(98912);
        preOrderTreeTraversal(t1);
    }
}
