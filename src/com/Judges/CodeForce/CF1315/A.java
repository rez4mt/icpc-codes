package com.Judges.CodeForce.CF1315;

import java.util.Scanner;

public class A {
    static int x , y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        while (T-->0)
        {
             x = sc.nextInt();
             y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            a++;
            b++;
            // (0,0) -> (a-1 , n)
            // (0,0) -> (n , b-1)
            // (a+1 , 0)->(n,n)
            // ( 0 , b+1 ) ->(n , n)
            points[] points = {new points(1,1,a-1,y),new points(1,1,x,b-1)
            ,new points(a+1,1,x,y),
                    new points(1,b+1,x,y)
            };
            long area = 0 ;
            for (points p :
                    points) {
                if(!p.valid(a,b))
                    continue;
                long aaa = p.area();
                area = Math.max(area ,aaa);
            }
            System.out.println(area);
        }
    }
    static class points{
        int x1 , x2 ;
        int y1 , y2;
        public points(int x1 , int y1 , int x2 , int y2)
        {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
        private long area()
        {
            return 1l*(Math.abs(x1-x2)+1)*(Math.abs(y1-y2)+1);
        }
        private boolean valid(int xn , int yn)
        {
            return x1>=1 && x2 >=1&& y1>=0 && y2>=1 && x1<=x && x2<=x && y1<=y&& y2<=y;
        }
    }
}
