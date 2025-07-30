public class KthBitChecker {
    public static void main(String[] args)
    {
        int n = 5;
        int k =3;
        if (isKthBitSet(n, k)) {
            System.out.println("The " + k + "th bit is set in " + n);
        } else {
            System.out.println("The " + k + "th bit is not set in " + n);
        }


    }

    public static boolean isKthBitSet(int n, int k){
        return (n & (1 << k)) !=0;
    }
}
