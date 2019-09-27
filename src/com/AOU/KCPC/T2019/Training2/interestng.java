//package com.AOU.KCPC.T2019.Training2;

import java.io.File;
import java.util.*;

public class interestng {
    public static void main(String[] args)  throws Exception {
        Scanner sc = new Scanner(new File("interestng.in"));
        int T = sc.nextInt();
        while (T-->0) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            sc.nextLine();
            String[] rows = new String[R];
            String[] cols = new String[C];
            for (int i = 0; i < C; i++) {
                cols[i] = "";
            }

            for (int i = 0; i < R; i++) {
                String rowsStr = sc.nextLine();
                rows[i] = rowsStr;
                char[] chars = rowsStr.toCharArray();
                for (int j = 0; j < C; j++) {
                    cols[j] += chars[j];
                }
            }

            ArrayList<String> all = new ArrayList<>();

            for(String r : rows) {
                String[] words = r.split("\\*");
                for (String w : words) {
                    if (w.length() >= 2) {
                        all.add(w);
                    }
                }
            }
            for (String c : cols) {
                String[] words = c.split("\\*");
                for (String w : words) {
                    if (w.length() >= 2) {
                        all.add(w);
                    }
                }
            }

            Collections.sort(all);
            if(all.size() == 0)
                System.out.println();
            else
                System.out.println(all.get(0));
        }


    }
}
