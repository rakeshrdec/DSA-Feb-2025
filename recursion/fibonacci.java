// Fibonacci series : 0 1 1 2 3 5 8 13 21 34\
                 //   1 2 3 4 5 6 7  8  9  10

public class fibonacci {

    public static int findFibo(int n)
    {
        if(n<=0)
        {
            System.out.println("Fibonacci series is not possible for this i/p");
            return -1;
        }
        if(n==1)
        {
            return 0;
        }
        if (n == 2)
        {
            return 1;            
        }

        return findFibo(n-1) + findFibo(n-2);
    }

    public static void main(String[] args) {
        System.out.println(" RADHE RADHE !!!");
        int n = 10;
        System.out.println("As per impl.. it will print nth fibonacci no : "+ findFibo(n));
        
    }
}
