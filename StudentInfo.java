import java.io.*;

public class StudentInfo {

    public static void main(String[] args) {
        try {
            // Get student information from the user
            DataInputStream dataInputStream = new DataInputStream(System.in);

            System.out.print("Enter Roll No: ");
            int rollNo = Integer.parseInt(dataInputStream.readLine());

            System.out.print("Enter Class: ");
            String className = dataInputStream.readLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(dataInputStream.readLine());

            System.out.print("Enter Weight: ");
            double weight = Double.parseDouble(dataInputStream.readLine());

            System.out.print("Enter Height: ");
            double height = Double.parseDouble(dataInputStream.readLine());

            System.out.print("Enter City: ");
            String city = dataInputStream.readLine();

            System.out.print("Enter Phone: ");
            String phone = dataInputStream.readLine();

            // Store student information in a file using FileOutputStream
            try (DataOutputStream dataOutputStream = new DataOutputStream(
                    new FileOutputStream("student_info.txt"))) {

                dataOutputStream.writeInt(rollNo);
                dataOutputStream.writeUTF(className);
                dataOutputStream.writeInt(age);
                dataOutputStream.writeDouble(weight);
                dataOutputStream.writeDouble(height);
                dataOutputStream.writeUTF(city);
                dataOutputStream.writeUTF(phone);

                System.out.println("Student information has been stored in the file.");
            } catch (IOException e) {
                System.err.println("Error writing to the file: " + e.getMessage());
            }

            // Retrieve data from the file using FileInputStream and display it
            try (DataInputStream fileInputStream = new DataInputStream(
                    new FileInputStream("student_info.txt"))) {

                System.out.println("\nRetrieving student information from the file:");

                System.out.println("Roll No: " + fileInputStream.readInt());
                System.out.println("Class: " + fileInputStream.readUTF());
                System.out.println("Age: " + fileInputStream.readInt());
                System.out.println("Weight: " + fileInputStream.readDouble());
                System.out.println("Height: " + fileInputStream.readDouble());
                System.out.println("City: " + fileInputStream.readUTF());
                System.out.println("Phone: " + fileInputStream.readUTF());

            } catch (IOException e) {
                System.err.println("Error reading from the file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.err.println("Error during input: " + e.getMessage());
        }
    }
}