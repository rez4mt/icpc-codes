
import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        StringBuilder builder = new StringBuilder();

        if(Integer.bitCount(n)>k)
        {
            System.out.println("NO");
            return;
        }else
        {
            //for each bit add it there..
            PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
            int hbit = log2(n);
            for(int i = hbit ; i >= 1 ; i--)
            {
                if(((n>>i) & 1) != 0 )
                {
                    pq.offer(2<<(i-1));
                    n -= 2<<(i-1);
                    if(n==0)
                        break;
                }
            }
            if(n==1)
                pq.offer(1);
            if(pq.size()!=k){
                //here .. check if u can devide the largest by 2.
                while (true)
                {
                    int larg = pq.poll();
                    if(larg>1)
                    {
                        pq.add(larg/2);
                        pq.add(larg/2);
                        if(pq.size()==k)
                            break;
                    }else{
                        System.out.println("NO");
                        return;
                    }
                }
            }
            PriorityQueue<Integer> mpq = new PriorityQueue<>();
            while (!pq.isEmpty()) mpq.add(pq.remove());
            while (!mpq.isEmpty())
                builder.append(mpq.poll()+" ");
            builder.deleteCharAt(builder.length()-1);
            System.out.println("YES");
            System.out.println(builder);
        }
    }
    static int log2( int bits )
    {
        if( bits == 0 )
            return 0; // or throw exception
        return 31 - Integer.numberOfLeadingZeros( bits );
    }
}
