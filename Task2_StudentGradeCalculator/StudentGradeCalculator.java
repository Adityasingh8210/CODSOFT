package Task2_StudentGradeCalculator;

import java.util.Scanner;

    public class StudentGradeCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("🎓 Student Grade Calculator 🎓");
            System.out.print("Enter number of subjects: ");
            int numSubjects = input.nextInt();

            int[] marks = new int[numSubjects];
            int total = 0;

            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                marks[i] = input.nextInt();
                total += marks[i];
            }

            double average = (double) total / numSubjects;
            String grade;

            if (average >= 90) {
                grade = "A+";
            } else if (average >= 80) {
                grade = "A";
            } else if (average >= 70) {
                grade = "B";
            } else if (average >= 60) {
                grade = "C";
            } else if (average >= 50) {
                grade = "D";
            } else {
                grade = "Fail";
            }

            System.out.println("\n📊 Total Marks: " + total);
            System.out.printf("📈 Average: %.2f\n", average);
            System.out.println("🏆 Grade: " + grade);

            input.close();
        }
    }


