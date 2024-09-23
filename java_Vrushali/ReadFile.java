import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file (with extension): ");
        String fileName = scanner.nextLine();
    
        // Create a File object
        File file = new File(fileName);
        
        // Read and display contents of the file
        try (FileInputStream fis = new FileInputStream(file)) {
            System.out.println("Contents of the file:");
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("File does not exist. It will be created.");
        }
        
        // Ask user if they want to add contents to the file
        System.out.print("\nDo you want to add contents to the file? (yes/no): ");
        String response = scanner.nextLine();


        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter the content to append: ");
            String userContent = scanner.nextLine();
            
            // Append content to the file
            try (FileOutputStream fos = new FileOutputStream(file, true)) {
                fos.write(userContent.getBytes());
                fos.write(System.lineSeparator().getBytes()); // To add a new line after appending
                System.out.println("Done");
            } 
            catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
            }
        }

        scanner.close();
    }
}
