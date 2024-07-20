import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the source file name: ");
        String srcFileName = sc.nextLine();

        System.out.println("Enter the destination file name: ");
        String destFileName = sc.nextLine();

        String fileContent = "";

        try (FileReader fileReader = new FileReader(srcFileName)) {
            int character;
            StringBuilder contentBuilder = new StringBuilder();
            while ((character = fileReader.read()) != -1) {
                contentBuilder.append((char) character);
            }
            fileContent = contentBuilder.toString();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        try (FileWriter fileWriter = new FileWriter(destFileName)) {
            fileWriter.write(fileContent);
            System.out.println("Content written to " + destFileName + " successfully");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
