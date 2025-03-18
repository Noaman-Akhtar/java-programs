import java.util.Scanner;

abstract class Student1 {
    int rollNo;
    int regNo;

    abstract void course(String courseName);
    abstract void branch(String branchName);
}

class Generic extends Student1 {
    @Override
    void course(String courseName) {
        System.out.println("Course: " + courseName);
    }

    @Override
    void branch(String branchName) {
        System.out.println("Branch: " + branchName);

        switch (branchName.toLowerCase()) {
            case "computer science":
                System.out.println("Details: This is the Computer Science branch.");
                break;
            case "electrical engineering":
                System.out.println("Details: This is the Electrical Engineering branch.");
                break;
            case "mechanical engineering":
                System.out.println("Details: This is the Mechanical Engineering branch.");
                break;
            case "chemical engineering":
                System.out.println("Details: This is the Chemical Engineering branch.");
                break;
            case "civil engineering":
                System.out.println("Details: This is the Civil Engineering branch.");
                break;
            default:
                System.out.println("Details: Unknown branch.");
                break;
        }
    }
}
public class lab5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Generic student1 = new Generic();

        System.out.print("Enter Roll No: ");
        student1.rollNo = scanner.nextInt();

        System.out.print("Enter Registration No: ");
        student1.regNo = scanner.nextInt();

        scanner.nextLine(); // Consume the newline

        System.out.print("Enter the branch: ");
        String branch = scanner.nextLine();

        System.out.print("Enter the course: ");
        String course = scanner.nextLine();

        // Print the student details
        student1.course(course);
        student1.branch(branch);
    }
}
