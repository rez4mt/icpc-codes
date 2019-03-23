public class Test{
    public static void main(String[] args)
    {
        int res = 0;
        for(int i = 0 ; i < 101 ; i++)
        {
             res += method(i);
        }
        System.out.println(res);
    }
    private static int method(int a)
    {
        System.out.println(a);
        int x = 0 ;
        while (a!=0)
        {
            if(a%10==1)
                x++;
            a = a/10;

        }
        System.out.println("this is x : "+x);
        return x;
    }
}