package Blogs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class operation {
    void mergeFiles() throws IOException {
        System.out.println("Enter the new file name which you want after merging");
        Scanner sc1 = new Scanner(System.in);
        String newFile = sc1.next();
        PrintWriter pw = new PrintWriter(newFile+".txt");

        System.out.println("Enter the first file name");
        Scanner sc = new Scanner(System.in);
        String File1_name = sc.next();
        BufferedReader br = new BufferedReader(new FileReader(File1_name+".txt"));
        String line = br.readLine();
        while (line!=null)
        {
            pw.println(line);
            line = br.readLine();
        }

        System.out.println("Enter the second file name");
        Scanner sc2 = new Scanner(System.in);
        String File2_name = sc2.next();
         br = new BufferedReader(new FileReader(File2_name+".txt"));
         line = br.readLine();
        while (line!=null)
        {
            pw.println(line);
            line = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
    }


    void extraction() throws Exception {
        System.out.println("Enter the new file name which you want after extraction");
        Scanner sc3 = new Scanner(System.in);
        String newFile = sc3.next();
        PrintWriter pw = new PrintWriter(newFile+".txt");

        System.out.println("Enter the first file name");
        Scanner sc = new Scanner(System.in);
        String File1_name = sc.next();
        BufferedReader br = new BufferedReader(new FileReader(File1_name+".txt"));
        String line = br.readLine();
        while(line!=null)
        {  boolean available = false;
            System.out.println("Enter the second file name ");
            Scanner sc2 = new Scanner(System.in);
            String File2_name = sc2.next();
            BufferedReader br2 = new BufferedReader(new FileReader(File2_name+".txt"));
            String target = br2.readLine();
            while(target!=null)
            {
                if(line.equals(target)){
                    available = true;
                    break;
                }
                target = br2.readLine();
            }
            if(available == false){
                pw.println(line);
            }
            line = br.readLine();

        }
        pw.flush();


    }

    void removingDuplicates() throws IOException {
        System.out.println("Enter the input file name");
        Scanner sc = new Scanner(System.in);
        String File1_name = sc.next();
        BufferedReader br = new BufferedReader(new FileReader(File1_name+".txt"));
        System.out.println("Enter the second file name ");
        Scanner sc2 = new Scanner(System.in);
        String File2_name = sc2.next();
        PrintWriter pw = new PrintWriter(File2_name+".txt");
        String line = br.readLine();
        while(line!=null)
        {  boolean available = false;
            BufferedReader br2 = new BufferedReader(new FileReader(File2_name+".txt"));
            String target = br2.readLine();
            while(target!=null)
            {
                if(line.equals(target)){
                    available = true;
                    break;
                }
                target = br2.readLine();
            }
            if(available == false){
                pw.println(line);
                pw.flush();
            }
            line = br.readLine();

        }



    }
}
