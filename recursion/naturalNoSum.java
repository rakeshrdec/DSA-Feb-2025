public class naturalNoSum {
    
    public static int sumOfNaturalNo(int n)
    {
        // do not use here n*(n+1)/2 <- DITRECT FORMULA
        if(n<0){
            System.out.println("sum is not possibile for this input");
        }

        if(n ==0 )
        {
            return 0;
        }

        return n + sumOfNaturalNo(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Hare Krishna !!");
        int n = 10;
        System.out.println("sum of n natural no is : "+ sumOfNaturalNo(n));

    }
    
}

//  TIME COMPLEXITY : Theta (n) = theta(n-1) + theta(1)
