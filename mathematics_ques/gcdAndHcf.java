public class gcdAndHcf {

    public static int findGCD(int a, int b)
    {
        //  GCD -> check for greatest Common Divisor Of Both
        int res = Math.min(a, b);
        while (res>0) {
            if(a%res==0 && b%res==0)
        {
            break ;
        }
        res--;            
        }
        return res;
         // Time Cpmlexity : O(min(a,b)) 

    }

    public static void main(String[] args) {
        int n1=18;
        int n2=16; 
        System.out.println("GCD of given no :"+findGCD(n1,n2));
        System.out.println("LCM of given nos is"+n1*n2/findGCD(n1, n2));
        
    }
}
