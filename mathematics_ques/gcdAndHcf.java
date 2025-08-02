public class gcdAndHcf {

    public static int findGCD(int a, int b) {
        // GCD -> check for greatest Common Divisor Of Both
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
        // Time Cpmlexity : O(min(a,b))

    }

    // EFFICUENT SOLUTION
    // Euclidean algorothm: If "b" is smaller than "a" and gcd(a,b) = gcd(a-b,b)
    public static int euclideanGcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
        // Time COmplexity : O(max(n1,n2)-mod[n1-n2])
    }

    public static int optimizedEuclideanGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return optimizedEuclideanGcd(b, a % b);
        }

    }

    // gcd( 18,16 ) = gcd(2, 16) =
    public static void main(String[] args) {
        int n1 = 18;
        int n2 = 17;
        System.out.println("GCD of given no :" + findGCD(n1, n2));
        System.out.println("LCM of given nos is" + n1 * n2 / findGCD(n1, n2));
        System.out.println("GCD of given no using EUCLIDEAN :" + euclideanGcd(n1, n2));
        System.out.println("GCD/HCF wit optimized solution is " + optimizedEuclideanGcd(n1, n2));

    }
}
