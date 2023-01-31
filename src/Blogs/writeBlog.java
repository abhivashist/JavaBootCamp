package Blogs;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class writeBlog {
    void writingBlog() throws FileNotFoundException {
        System.out.println("Enter the file name in which you want to write");
        Scanner sc = new Scanner(System.in);
        String File_name = sc.next();
        PrintWriter pw = new PrintWriter(File_name+".txt");
        System.out.println("\nType the Information \n");
        Scanner sc1 = new Scanner(System.in);
        String Para = sc1.nextLine();
        pw.println(Para);
        System.out.println(" Committed Successfully ");
        pw.flush();
        pw.close();
    }

    void appendBlog() throws IOException {
        System.out.println("Enter the file name in which you want to append");
        Scanner sc1 = new Scanner(System.in);
        String File_name = sc1.next();
        FileWriter pw = new FileWriter(File_name+".txt",true);
        System.out.println("\nType the Information \n");
        Scanner sc2 = new Scanner(System.in);
        String Para = sc2.nextLine();
        pw.write(Para);
        System.out.println("Appended Successfully");
        pw.flush();
        pw.close();

    }
}
