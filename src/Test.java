import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Test {
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
             int[] list = new int[3];

             int sum = 0 ;
             for(int i = 0 ;i <  3 ; i++)
             {
                 list[i] = sc.nextInt();
                 sum += list[i];
             }
             Arrays.sort(list);
             //list[1] is median

             sum /= 3;
             for(int i = 0 ; i <3 ; i++)
             {
                 if(list[i] < sum)
                     list[i]++;
                 else if(list[i] > sum)
                     list[i] -- ;
             }
             long ans = Math.abs(list[0] - list[1]) + Math.abs(list[1] - list[2]) + Math.abs(list[2]- list[0]) ;
            System.out.println(ans);
        }
    }*/
   public static void main(String[] args) {
       int n = 3;
       System.out.println(n);
       while (n-->0)
       {
           System.out.println();
           Random r = new Random();
           int max_char = r.nextInt(5);
           System.out.println((char)('A'+max_char));
           int edges = r.nextInt(10);
           HashSet<String> set = new HashSet<>();
           while (edges-->0)
           {
               int a = r.nextInt(max_char+1);
               int b = r.nextInt(max_char+1);
               String sA = ((char)('A'+a)) +""+((char)('A'+b));
               String sB = ((char)('A'+b))+""+((char)('A'+a));
               if(!set.contains(sA) && !set.contains(sB))
               {
                   set.add(sA);
                   set.add(sB);
                   //sout
                   System.out.println(sA);
               }
           }
       }



   }
}























   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n = sc.nextInt();
            System.out.println(cal(n));
        }
    }
    static int cal(int i)
    {
        int nDigits = 0;
        int last_mod =0;
        do{
            last_mod = (10 * last_mod + 1 ) % i;
            nDigits++;
        }while (last_mod!=0);
        return nDigits;
    }*/

    /*//public static void main(String[] args)
    {
        System.out.printf("%.2f",1);
    }


    public static int[] reverse(int[] stream)
    {
        int n = stream.length;
        int[] new_array = new int[n];
        *//*for(int i = 0 ; i < n ;i++)
        {
            new_array[i] = stream[n-1-i];
        }*//*
        for(int i = n-1 ; i >= 0 ;i--)
        {
            new_array[i] = stream[n-1-i];
            //new_array[n-1-i] = stream[i];
            System.out.println(Arrays.toString(new_array));
        }
    }
    public static void main(String[] args) {
        int[] myarray = new int[]{1,2,3,4,5,6,7};
        //System.out.println(Arrays.toString(myarray));

        System.out.println(Arrays.toString(myarray));
        System.out.println(Arrays.toString(reverse(myarray)));

    }*/

//}