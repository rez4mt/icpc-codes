package com.Judges.CodeForce.CF961;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] infos = new int[n][2];

        int res = 0;

        for(int i = 0 ; i < n ; i ++)
        {
            infos[i][0] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i ++)
        {

            infos[i][1] = sc.nextInt();
            if(infos[i][1] == 1)
                res += infos[i][0];
        }

        int ans = 0;
        for (int i = 0; i < k; i++) {
            if(infos[i][1] == 0)
                ans+=infos[i][0];
        }
        int max = ans;
        for (int i = 1; i <n-k + 1; i++) {
            if(infos[i - 1][1] == 0)
                ans -= infos[i - 1][0];
            if(infos[i + k - 1][1] == 0){
                ans += infos[i + k - 1][0];
            }
            max = Math.max(ans, max);
        }

        res += max;
        System.out.println(res);
    }
}
