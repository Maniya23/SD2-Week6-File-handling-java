import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class fileWriteArray {


    public static void main(String[] args) {
        int [] row1 = {1,2,3,4,5,6,7,8,9,10};
        try {
            FileWriter myWriter = new FileWriter("text.txt");
            myWriter.write(Arrays.toString(row1));
            myWriter.close();
            System.out.println("Successfully wrote to file");

        } catch (IOException e) {
            System.out.println("An error has occurred while trying to write file");
        }
    }
}
