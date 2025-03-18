import java.util.Scanner;

class student {
    int roll;
    String name;
    double cgpa;

    // Constructor to initialize student details
    student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class lab34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        student[] students = new student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            students[i] = new student(roll, name, cgpa);
        }

        // Display student details
        System.out.println("\nStudent details:");
        for (student student : students) {
            System.out.println("Roll: " + student.roll + ", Name: " + student.name + ", CGPA: " + student.cgpa);
        }

        // Find the student with the lowest CGPA
        student lowestCgpaStudent = students[0];
        for (student student : students) {
            if (student.cgpa < lowestCgpaStudent.cgpa) {
                lowestCgpaStudent = student;
            }
        }

        // Display the name of the student with the lowest CGPA
        System.out.println("\nStudent with the lowest CGPA: " + lowestCgpaStudent.name);
    }
}
