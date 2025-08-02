public class checkPalindrone {
    private boolean isPalindrome(String s)
    {
        System.out.println("start chceking palindrome for no "+s);
        String newstr ="";
        for (int i=0;i<s.length(); i++)
        {
            System.out.println(s.charAt(s.length()-i-1));
            newstr = newstr + s.charAt(s.length()-i-1);
        }
        System.out.println("new str"+newstr);
        return newstr.equals(s);
        // function time complexity : Theta(len of the string)
        // function space complexity is : O(1)
    }  

    public static void main(String [] args)
    {
        checkPalindrone a = new checkPalindrone();
        String s = "nitin";
        System.out.println(" palindrome check staus for "+s+ " is :"+a.isPalindrome(s));
    };    

}
