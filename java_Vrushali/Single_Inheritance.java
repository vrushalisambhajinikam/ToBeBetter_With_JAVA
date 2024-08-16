package Basics;
import java.time.LocalDate;
import java.time.Period;

class Person {
    String name;
    LocalDate birthdate;
    double height;
    double weight;
    String address;

    // Constructor
    public Person(String name, LocalDate birthdate, double height, double weight, String address) {
        this.name = name;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    // Method to calculate age
    public int calculateAge() {
        return Period.between(this.birthdate, LocalDate.now()).getYears();
    }

    // Display method to print person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Address: " + address);
        System.out.println("Age: " + calculateAge());
    }
}

class Student extends Person {
    int rollNo;
    double[] marks;

    // Constructor
    public Student(String name, LocalDate birthdate, double height, double weight, String address, int rollNo, double[] marks) {
        super(name, birthdate, height, weight, address);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to calculate average marks
    public double calculateAvg() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average Marks: " + calculateAvg());
    }
}

class Employee extends Person {
    int empId;
    double salary;

    // Constructor
    public Employee(String name, LocalDate birthdate, double height, double weight, String address, int empId, double salary) {
        super(name, birthdate, height, weight, address);
        this.empId = empId;
        this.salary = salary;
    }

    // Method to calculate tax
    public double calculateTax() {
        return salary * 0.2; // Assuming a flat 20% tax rate
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + calculateTax());
    }
}


public class Single_Inheritance {

    public static void main(String[] args) {
        // Creating Person object
        Person person = new Person("John Doe", LocalDate.of(1985, 5, 20), 175, 75, "123 Main St, City");
        System.out.println("Person Details:");
        person.display();

        // Creating Student object
        double[] marks = {85, 90, 78, 92, 88};
        Student student = new Student("Alice", LocalDate.of(2000, 7, 15), 165, 55, "456 Maple Ave, City", 101, marks);
        System.out.println("\nStudent Details:");
        student.display();

        // Creating Employee object
        Employee employee = new Employee("Bob", LocalDate.of(1990, 3, 10), 180, 80, "789 Oak Dr, City", 1001, 60000);
        System.out.println("\nEmployee Details:");
        employee.display();
    }
}
