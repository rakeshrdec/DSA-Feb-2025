import java.math.BigInteger;

public class trailingZeros {

    public static BigInteger factorial(int n){
        if(n<0)
        {
            return BigInteger.valueOf(-1);
        }

        if (n==0)
        {
            return BigInteger.valueOf(1);
        }
        BigInteger result =BigInteger.valueOf(1);
        while (n > 1) {
            result = result.multiply(BigInteger.valueOf(n));
            n--;
        }
        return result;
        // TIME Complexity : O(n)
        // SPace complexity : O(1)
    }

    public static void main(String[] args) {
        System.out.println("Har Har Mahadev !");
        // trailingZeros t = new trailingZeros();
        int num = 30;
        // trailing zeros in factorial of goiven num 
        int trailingZeroCOunt = 0;
        for(int i = 5; i <= num; i *= 5)
        {
            trailingZeroCOunt = trailingZeroCOunt + num / i;
        }
        // Time COmplexity : O(n/5)
        // Space complexity : O(1)
        // Auxilary Space : O(n/5)
        System.out.println("printing factorial of given num "+factorial(num));
        System.out.println("trailing zero count of factorial of given number is :"+trailingZeroCOunt);
    }
}
