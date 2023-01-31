package Blogs;

import java.io.File;
import java.util.Scanner;

public class deleteBlog {
    void deletingBlog()
    {
        System.out.println("Enter the file name you want to delete");
        Scanner sc = new Scanner(System.in);
        String File_name = sc.next();
        File myFile = new File(File_name+".txt");
        if(myFile.delete()){
            System.out.println(" Deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
