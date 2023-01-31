package Blogs;

import java.io.IOException;
import java.util.Scanner;

 class initi {
    public static void main(String[] args) throws IOException {
        System.out.println("!!!!!!!!!!!!!!!!!! WELCOME TO BLOGGING !!!!!!!!!!!!!!!!!!!");
        System.out.println("Choose one of the option below to proceed : \n " +
                "1. Create a new Blog \n" +
                "2. Create a new Folder \n" +
                "3. View all the Blog List\n" +
                "4. Write in a BlogFile \n " +
                "5. Append in a BlogFile \n" +
                "6. Read a Blog \n" +
                "7. Delete a Blog \n" +
                "8. Merge 2 Blogs \n" +
                "9. Extraction \n" +
                "10.Remove Duplicates" );

        createBlog t = new createBlog();
        writeBlog w =new writeBlog();
        readBlog z = new readBlog();
        deleteBlog d = new deleteBlog();
        operation o = new operation();
        Character c='y';
        while(c=='y') {
            System.out.println("\n Enter your choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    t.creatingBlog();
                    break;
                case 2:
                    t.creatingFolder();
                    break;
                case 3:
                    t.viewList();
                    break;
                case 4:
                    w.writingBlog();
                    break;
                case 5:
                    w.appendBlog();
                    break;
                case 6:
                    z.readingBlog();
                    break;
                case 7:
                    d.deletingBlog();
                    break;
                case 8:
                    o.mergeFiles();
                    break;
                case 9:

                    break;

            }
            System.out.println("\n Do you want to proceed. Press y or n");
            Scanner sc1 = new Scanner(System.in);
            c = sc.next().charAt(0);
        }
    }
}
