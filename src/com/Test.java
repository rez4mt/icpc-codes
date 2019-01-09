package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) throws IOException {
        //C:\Users\r_mot\Desktop\java-app\URI\URI\src\com\Judges\CodeForce
        File f = new File("C:\\Users\\r_mot\\Desktop\\java-app\\URI\\URI\\src\\com\\Judges\\CodeForce");
        File[] files = f.listFiles();
        Pattern pattern = Pattern.compile("(CF[0-9]+)([A-Z])");
        for (File file:files)
        {

            Matcher m = pattern.matcher(file.getName());
            if(!m.find())
                continue;
            String dir_name = m.group(1);
            String file_name = m.group(2);
            File target_dir = new File(f.getAbsolutePath()+"/"+dir_name);
            File target_file = new File(target_dir.getAbsolutePath()+"/"+file_name+".java");
            System.out.println(target_file.getAbsolutePath());
            if(!target_dir.isDirectory())
            {
                System.out.println("not dir");
                if(!target_dir.mkdir())
                {
                    System.out.println("Cant create");
                    continue;
                }
            }

            if(target_file.isFile())
            {
                System.out.println("File exists");
                continue;
            }
            StringBuilder b = new StringBuilder();
            b.append(new String(Files.readAllBytes(Paths.get(file.getAbsolutePath()))).
                    replace("package com.Judges.CodeForce;",
                            "package com.Judges.CodeForce."+dir_name+";")
                    .replace(dir_name+file_name,file_name)
            );
            if(!target_file.createNewFile())
            {
                System.out.println("Not created");
                continue;
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(target_file));
            writer.write(b.toString());
            writer.close();
            System.out.println("Done");
            file.delete();
        }

    }
    /*public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        print(mat);
        rotateMin90(mat);
        //rotate90(mat);
    }

    private static void print(int[][] data)
    {
        for(int i = 0 ; i < data.length; i ++)
        {
            for(int j = 0 ; j < data[i].length;j++)
            {
                System.out.printf("%s",String.valueOf(data[i][j]));
            }
            System.out.println();
        }
        System.out.println();

    }
    private static void rotateMin90(int[][] d)
    {
        int[][] newmat = new int[d.length][d[0].length];
        for(int i = 0 ; i < d.length; i ++)
        {
            for(int j = 0 ; j < d.length ; j++)
            {
                newmat[i][j] = d[j][d.length-1-i];
            }
        }
        print(newmat);
        rotate90(newmat);
    }
    private static void rotate90(int[][] d)
    {
        int[][] newmat = new int[d.length][d[0].length];
        for(int i = 0 ; i < d.length; i ++)
        {
            for(int j = 0 ; j < d.length ; j++)
            {
                newmat[i][j] = d[d.length-1-j][i];
            }
        }
        print(newmat);
    }*/
}
