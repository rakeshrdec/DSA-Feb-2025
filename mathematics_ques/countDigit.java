public class countDigit
{
    public int countTotalDigit(int n)
        {
            // if(n < 0)
            // {
            //     System.out.println("Given no is less then 0");
            //     return 0;
            // };
            n = Math.abs(n);
            int count = 0;
            while (n!=0) 
            {
                System.out.println("no. reached upto "+String.valueOf(n));
                System.out.println("count reached upto "+Integer.toString(count));
                count++;
                n = n/10;                
            }
            return count;
        };

    
        public int countTotalDigitwithBigOone(int n)
        {
            n = Math.abs(n);
            return (int) Math.log10(n) +1;
        }
    public static void main(String [] args)
    {
        System.out.println("Hii this is new print");
        countDigit c = new countDigit();
        int n = -12345;
        int result = c.countTotalDigit(n);
        System.out.println("Total digits in " + n + " is: " + result);
        int result2 = c.countTotalDigitwithBigOone(n);
        System.err.println("print count digit with Big O 1 complexity is "+result2);
    }

}


// TIME COMPLEXITY : Theta(d= no of digit in no)
// SPACE COMPLEXITY -> 1 + 1+ 1+1 => O(1)
// Auxilary Space -> O(1)

