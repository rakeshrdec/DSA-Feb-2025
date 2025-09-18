public class LinearSearch{

    public static int LinearSearch(int [] a, int searchValue){
        for(int i =0 ; i < a.length; i++)
        {
            if(a[i]==searchValue)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.err.println("Hk ... ! ... ");
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToBeSearch=10;
        int Valuepositin = LinearSearch(a, valueToBeSearch);
        if(Valuepositin<0)
        {
            System.err.println("value is not present in the list ");
        } else
        {
            System.err.print("Value is present at position : ");
            System.err.println(Valuepositin);
        }
        
    }
}