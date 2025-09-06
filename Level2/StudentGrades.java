import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Physics marks: ");
            physics[i] = sc.nextInt();
            System.out.print("Chemistry marks: ");
            chemistry[i] = sc.nextInt();
            System.out.print("Maths marks: ");
            maths[i] = sc.nextInt();

            percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        System.out.println("\n=== Result ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " -> %: " + percent[i] + " Grade: " + grade[i]);
        }
    }
}

