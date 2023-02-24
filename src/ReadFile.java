import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("text.txt");
            Scanner fileRead = new Scanner(file);
            while (fileRead.hasNextLine()) {
                String text = fileRead.nextLine();
                System.out.println(text);
            }
            fileRead.close();
        } catch (IOException e) {
            System.out.println("Error generated while reading the file");
            e.printStackTrace();
        }
    }
}