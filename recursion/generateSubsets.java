public class generateSubsets {
    static void subsets(String s, String curr, int index)
    {
        if (index == s.length())
        {
            System.out.println(curr);
            // System.out.println("string reached upto last index");
            return;
        }
        // curr = "*"+","+s.charAt(index);
        subsets(s, curr, index+1);
        subsets(s, curr+s.charAt(index), index+1);
        
    }
    public static void main(String[] args) {
        System.out.println("Hare Krishna !!");
        String s = "ABC";
        subsets(s,"",0);
    }
}
