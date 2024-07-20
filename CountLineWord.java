import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;


public class CountLineWord {
    public static void main(String[] args) {
        String fileName = "src/FileSource.txt";

        int lineCount = 0;
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;

                StringTokenizer tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens()) {
                    tokenizer.nextToken();
                    wordCount++;
                }
            }

            System.out.println("Total lines: " + lineCount);
            System.out.println("Total words: " + wordCount);

        } catch (IOException e) {
            System.err.println("Error occured reading the file: " + e.getMessage());
        }
    }
}
