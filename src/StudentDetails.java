import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student Mobile Number: ");
        long mobileNumber = scanner.nextLong();

        System.out.print("Enter Student Percentage: ");
        float percentage = scanner.nextFloat();

        System.out.print("Enter Student CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.print("Is Student Passed (true/false): ");
        boolean isPassed = scanner.nextBoolean();

        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + studentName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Percentage: " + percentage);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Passed: " + isPassed);

        scanner.close();
    }
}
