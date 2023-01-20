import java.io.File;
import java.io.IOException;

public class Creating_New_File {

    public static void main(String[] args) {

        File myFile = new File("JavaDemo.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
