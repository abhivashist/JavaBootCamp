package Blogs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

 class createBlog {
    void creatingBlog() throws IOException {
        System.out.println("Give the Blog name");
        Scanner sc = new Scanner(System.in);
        String Blog_name = sc.next();
        File f = new File(Blog_name + ".txt");
        if (f.exists()) {
            System.out.println("File already exist. You can append in it");
        } else {
            System.out.println("File created");
            f.createNewFile();
        }
    }

    void creatingFolder() throws IOException {
        System.out.println("Give the Folder name");
        Scanner sc = new Scanner(System.in);
        String Folder_name = sc.next();
        File f = new File(Folder_name + ".txt");
        if (f.exists()) {
            System.out.println("Folder already exist.");
        } else {
            System.out.println("Folder created");
            f.mkdir();
        }
    }
    void viewList()
    {
        int count = 0;
        File f=new File("C:\\Users\\Abhishek Vashist\\IdeaProjects\\JavaBootCamp");
        String[] s = f.list();
        for(String s1:s) {
            File f1 = new File(f,s1);
            if(f1.isFile()){
                count++;
                System.out.println(s1);
            }
        }
        System.out.println("The Total Number :" +count);
    }
}
