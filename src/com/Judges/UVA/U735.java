package com.Judges.UVA;
import java.util.*;
public class U735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sep = "**********************************************************************";
        HashSet<Integer> set = new HashSet<>();
        for(int i =0 ; i <=20 ; i++)
        {
            set.add(i);
            set.add(i*2);
            set.add(i*3);
        }

        ArrayList<Integer> scores = new ArrayList<>(set);
        scores.add(50);
        Collections.sort(scores);

        StringBuilder sb = new StringBuilder();
        while(true)
        {
            int score = sc.nextInt();
            if(score<=0)
                break;
            int combinations = 0; int permutations = 0;
            for(int a = 0; a < scores.size(); a++)
                for(int b = 0; b < scores.size(); b++)
                    for(int c = 0; c < scores.size(); c++)
                        if(scores.get(a)+scores.get(b)+scores.get(c)==score)
                        {
                            permutations++;
                            if(b>=a && c>=b)
                                combinations++;
                        }
            if(permutations==0)
                sb.append("THE SCORE OF "+score+" CANNOT BE MADE WITH THREE DARTS.\n");
            else
            {
                sb.append("NUMBER OF COMBINATIONS THAT SCORES "+score+" IS "+combinations+".\n");
                sb.append("NUMBER OF PERMUTATIONS THAT SCORES "+score+" IS "+permutations+".\n");
            }
            sb.append(sep+"\n");

        }

        sb.append("END OF OUTPUT\n");
        System.out.print(sb);

    }
}
