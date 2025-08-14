import java.util.Scanner;



public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle (in inches): ");
        double baseInches = sc.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        double heightInches = sc.nextDouble();

        double areaInches = 0.5 * baseInches * heightInches;
        double areaCm = areaInches * 6.4516;

        double heightCm = heightInches * 2.54;
        double heightFeet = heightInches / 12.0;

        System.out.printf("Area of triangle: %.2f square inches, %.2f square centimeters\n", areaInches, areaCm);
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n", heightCm, heightFeet, heightInches);

        sc.close();
    }
}
