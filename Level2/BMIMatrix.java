import java.util.Scanner;

public class BMIMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // weight, height, bmi
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            double height = sc.nextDouble();

            double bmi = weight / (height * height);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 24.9) weightStatus[i] = "Normal";
            else if (bmi < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\n=== BMI Report ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " -> W: " + personData[i][0] +
                               " H: " + personData[i][1] + " BMI: " + personData[i][2] +
                               " Status: " + weightStatus[i]);
        }
    }
}

