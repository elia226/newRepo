package studentgrading;

import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
  
        try (Scanner input = new Scanner(System.in)) {
            // Get student info
            System.out.print("Enter student name: ");
            String name = input.nextLine();
            
            // Get scores
            System.out.print("Enter score for Quiz (0-100): ");
            double quiz = input.nextDouble();
            
            System.out.print("Enter score for Midterm Exam (0-100): ");
            double midterm = input.nextDouble();
            
            System.out.print("Enter score for Final Exam (0-100): ");
            double finals = input.nextDouble();
            
            // Calculate average
            double average = (quiz + midterm + finals) / 3;
            
            // Determine grade
            String grade;
            if (average >= 90) {
                grade = "A";
            } else if (average >= 80) {
                grade = "B";
            } else if (average >= 70) {
                grade = "C";
            } else if (average >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            
            // Display results
            System.out.println("\n--- Student Grade Report ---");
            System.out.println("Name: " + name);
            System.out.printf("Average Score: %.2f%n", average);
            System.out.println("Grade: " + grade);
        }
    }
}

