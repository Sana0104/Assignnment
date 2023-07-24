package BasicDataStructure;

import java.util.Scanner;

public class Marks {

        public static void main(String[] args) {
            int numStudents = 3;
            int numSubjects = 3;

            int[][] marks = new int[numStudents][numSubjects];


            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < numStudents; i++) {
                for (int j = 0; j < numSubjects; j++) {
                    System.out.print("Enter marks for Student " + (i + 1) + " Subject " + (char) ('A' + j) + ": ");
                    marks[i][j] = scanner.nextInt();
                }
            }


            int[] subjectTotal = new int[numSubjects];
            double[] subjectAverage = new double[numSubjects];

            for (int j = 0; j < numSubjects; j++) {
                for (int i = 0; i < numStudents; i++) {
                    subjectTotal[j] += marks[i][j];
                }
                subjectAverage[j] = (double) subjectTotal[j] / numStudents;
            }


            int[] studentTotal = new int[numStudents];
            double[] studentAverage = new double[numStudents];

            for (int i = 0; i < numStudents; i++) {
                for (int j = 0; j < numSubjects; j++) {
                    studentTotal[i] += marks[i][j];
                }
                studentAverage[i] = (double) studentTotal[i] / numSubjects;
            }


            System.out.println("\nSubject-wise Total and Average Marks:");
            for (int j = 0; j < numSubjects; j++) {
                System.out.println("Subject " + (char) ('A' + j) + ": Total=" + subjectTotal[j] + ", Average=" + subjectAverage[j]);
            }

            System.out.println("\nStudent-wise Total and Average Marks:");
            for (int i = 0; i < numStudents; i++) {
                System.out.println("Student " + (i + 1) + ": Total=" + studentTotal[i] + ", Average=" + studentAverage[i]);
            }


            scanner.close();
        }

}
