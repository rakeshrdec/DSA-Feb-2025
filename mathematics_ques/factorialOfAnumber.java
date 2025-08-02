public class factorialOfAnumber {
    public static void main(String[] args) {
        System.out.println("Har Har MahaDev !!!");
        factorialOfAnumber x = new factorialOfAnumber();
        System.out.println("Factoril is :"+x.factorial(15));
    }
    private int factorial(int n){
        if(n<0)
        {
            return -1;
        }

        if (n==0)
        {
            return 1;
        }
        int result = 1;
        while (n>1) {
            result = result*n;
            n--;                        
        }
        return result;
        // TIME Complexity : O(n)
        // SPace complexity : O(1)
    }
}
