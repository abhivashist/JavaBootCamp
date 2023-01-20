import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writing_to_File {
    public static void main(String[] args) {
        File myFile = new File("JavaDemo.txt");
        try {
            FileWriter fileWriter = new FileWriter("JavaDemo");
            fileWriter.write("!!!!!!!!!!!!Be Happy!!!!!!!!!!!!!!!!\nKeep learning, Keep coding!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
