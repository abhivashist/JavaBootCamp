import java.io.File;

public class Delete_a_File {

    public static void main(String[] args) {

        File myFile = new File("JavaDemo");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}
