// string "nitin" ->
public class checkPalindrome {

    public static int isStrPalindrome(String s, int strStart, int strEnd)
    {
        // System.out.println(s.charAt(strEnd) +" start str "+ s.charAt(strStart));
        if(strStart>strEnd)
        {
            System.out.println("string is palindrome");
            return 1;
        }
        if(s.charAt(strEnd)==s.charAt(strStart))
        {
            return isStrPalindrome(s, strStart+1, strEnd-1);
        }

        System.out.println("given str is not palindrome");
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Radhe Radhe !!!");
        String n = "12321";
        int start = 0;
        int end = n.length() -1;
        // System.out.println(n.charAt(end) +" start str "+ n.charAt(start));
        isStrPalindrome(n, 0, n.length() -1);

    }        
}
