import java.util.*;

public class ropeCuttingProblem {

    public static int ropeCut(int n, int a, int b, int c)
    {
        // List<Integer> arr1 = new ArrayList<>();
        // List<Integer> arr2 = new ArrayList<>();
        // List<Integer> arr3 = new ArrayList<>();

        System.out.println("processing function for values and cuts respectively "+n+" "+a+" "+b+" "+c);
        if(n<0)
        {
            System.out.println("for this value system fails");
            return -1;
        }

        if(n==0)
        {
            System.out.println("for this value system reached upto root node with valid input");
            return 1;
        }

        int biggest;
        int r1 = ropeCut(n-a, a, b, c);
        int r2 = ropeCut(n-b, a, b, c);
        int r3 = ropeCut(n-c, a, b, c);
        if (r1 >= r2 && r1 >= r3) {
            biggest = r1;
            // System.out.println(r1+" selected in the flow");
        } else if (r2 >= r1 && r2 >= r3) {
            biggest = r2;
            // System.out.println(r2+" selected in the flow");
        } else {
            biggest = r3;
            // System.out.println(r3+" selected in the flow");
        }

        if(biggest<0)
        {
            return -1;
        }
         return biggest+1;

    }
    public static void main(String[] args) {
        System.out.println("Hare krishna !!");
        int n =9;
        int a=2;
        int b=2;
        int c=2;
        System.out.println("calling the repo cut function");
        System.out.println("Max deep height or pices for the given inputs are "+ropeCut(n, a, b, c));
        // Time cpmplexity : O(3^n)
    }
    
}
