import java.io.File;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File exists.");
            
            if (file.canWrite()) {
                System.out.println("File is writable.");
            } else {
                System.out.println("File is not writable.");
            }
            
            String fileType = getFileExtension(file);
            System.out.println("File type: " + (fileType.isEmpty() ? "Unknown" : fileType));
            
            long fileLength = file.length();
            System.out.println("File length: " + fileLength + " bytes.");
        } else {
            System.out.println("File does not exist.");
        }
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        int lastIndexOfDot = fileName.lastIndexOf('.');
        if (lastIndexOfDot == -1) {
            return "";
        }
        return fileName.substring(lastIndexOfDot + 1);
    }
}
