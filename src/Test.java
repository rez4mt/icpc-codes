import java.util.Arrays;

public class Test{
    //public static void main(String[] args)
    {
        System.out.printf("%.2f",1);
    }


    public static int[] reverse(int[] stream)
    {
        int n = stream.length;
        int[] new_array = new int[n];
        /*for(int i = 0 ; i < n ;i++)
        {
            new_array[i] = stream[n-1-i];
        }*/
        for(int i = n-1 ; i >= 0 ;i--)
        {
            new_array[i] = stream[n-1-i];
            //new_array[n-1-i] = stream[i];
            System.out.println(Arrays.toString(new_array));
        }
        return new_array;
    }
    public static void main(String[] args) {
        int[] myarray = new int[]{1,2,3,4,5,6,7};
        //System.out.println(Arrays.toString(myarray));

        System.out.println(Arrays.toString(myarray));
        System.out.println(Arrays.toString(reverse(myarray)));

    }

}