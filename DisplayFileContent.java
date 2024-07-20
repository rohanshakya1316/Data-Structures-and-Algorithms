import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFileContent {
    public static void main(String[] args) {
        String fileName = "src/FileSource.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNum = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + lineNum + ": " + line);
                lineNum++;
            }
        } catch (IOException e) {
            System.err.println("Error occured reading the file: " + e.getMessage());
        }
    }
}
