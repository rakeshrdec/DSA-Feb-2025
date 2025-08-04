public class sumOfDigits {

    public static int allDigitSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n%10 + allDigitSum(n/10);
    }
    public static void main(String[] args) {
        System.out.println("HARI BOL !!!");

        int n = 178753;
        int result = allDigitSum(n);
        System.out.println("print of all digit of given no is " + result);
    }
}
