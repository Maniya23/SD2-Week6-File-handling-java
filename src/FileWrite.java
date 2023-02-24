import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("This is what i want to be written");
            myWriter.close();
            System.out.println("Successfully wrote to file");

        } catch (IOException e) {
            System.out.println("An error has occurred while trying to write file");
        }
    }
}
