public class factorial {

    public static int findFact(int n)
    {
        if ( n == 0)
        {
            return 1;
        }
        return n * findFact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("HARE KRISHNA !!!");
        int n = 1;
        System.out.println(findFact(n));
    }
    
}
