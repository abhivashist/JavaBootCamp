package Blogs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readBlog {
    void readingBlog() throws IOException {
        System.out.println("\n Which file do you want to read \n");
        Scanner sc = new Scanner(System.in);
        String File_name = sc.next();
        FileReader fr = new FileReader(File_name+".txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line=br.readLine();

        }
        br.close();
    }
}
