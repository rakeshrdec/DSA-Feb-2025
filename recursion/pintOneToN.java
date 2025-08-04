public class pintOneToN {
    
    public static void printUpToN(int n){
        if(n==0)
        {
            System.out.println(0);
            return;
        }
        System.out.println(n);
        printUpToN(n-1);
    }

        public static void printNtoOne(int n){        
        if(n==0)
        {
            System.out.println(0);
            return;
        }
        printNtoOne(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        System.out.println("Hare Krishna !!");
        int n = 100;
        // printUpToN(n);
        System.out.println("!! Radhe Radhe !!");
        printNtoOne(n);
    }
}
