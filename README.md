🎓 Student Details Program in Java
📌 Description

This Java program collects and displays student details using the Scanner class.
It demonstrates how to take different types of user input (int, String, long, float, double, boolean) from the console and print them in a structured format.

This is a beginner-level Java program, commonly asked in college practicals and interviews.

🧩 Problem Statement

Create a Java program that:

Takes student information from the user

Displays the entered student details neatly

✅ Student Details Collected

Roll Number (int)

Name (String)

Mobile Number (long)

Percentage (float)

CGPA (double)

Pass Status (boolean)

✅ Code
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

🧠 Explanation

Scanner is used to take input from the user

Different methods are used for different data types:

nextInt() → integer input

nextLine() → string input

nextLong() → long input

nextFloat() → float input

nextDouble() → double input

nextBoolean() → boolean input

scanner.nextLine() is used after nextInt() to clear the input buffer

Finally, all student details are printed to the console

🖨 Sample Output
--- Student Details ---
Roll No: 101
Name: Rahul
Mobile Number: 9876543210
Percentage: 85.5
CGPA: 8.7
Passed: true

🛠 Concepts Used

Java Classes & Objects

main() method

Scanner class

Primitive data types

Console input/output

🎯 Use Cases

Java beginners

College practical exams

Interview preparation

Learning user input in Java

🚀 Possible Improvements

Store data using a Student class

Add validation for mobile number & percentage

Use loops for multiple students

Save details to a file

👨‍💻 Author

Pranay Jadhao
