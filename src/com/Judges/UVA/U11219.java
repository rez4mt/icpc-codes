package com.Judges.UVA;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class U11219 {
    public static void main(String[] args) throws  ParseException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        int C = 0;
        while (T-->0)
        {
            //)
            long current = sdf.parse(sc.next()).getTime();
            long bdate = sdf.parse(sc.next()).getTime();

            if(bdate > current)
            {
                System.out.printf("Case #%d: Invalid birth date\n",++C);
            }else {
                Calendar current_cal = Calendar.getInstance();
                Calendar bdate_cal = Calendar.getInstance();
                current_cal.setTime(new Date(current));
                bdate_cal.setTime(new Date(bdate));
                int diff = current_cal.get(Calendar.YEAR) - bdate_cal.get(Calendar.YEAR);
                if(diff > 130)
                {
                    System.out.printf("Case #%d: Check birth date\n",++C);
                }else
                {
                    if (current_cal.get(Calendar.MONTH)<bdate_cal.get(Calendar.MONTH) ||
                            (current_cal.get(Calendar.MONTH)==bdate_cal.get(Calendar.MONTH) &&
                                    current_cal.get(Calendar.DAY_OF_MONTH)<bdate_cal.get(Calendar.DAY_OF_MONTH))) {
                        diff--;
                    }

                    System.out.printf("Case #%d: %d\n",++C,diff);
                }
            }
        }
    }
}
