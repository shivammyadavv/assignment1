import java.util.Scanner;

public class Fees2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for fee
        System.out.print("Enter the Student Fee (INR): ");
        double fee = scanner.nextDouble();

        // Take user input for discount percent
        System.out.print("Enter the University Discount Percent: ");
        double discountPercent = scanner.nextDouble();

        // Compute the discount amount
        double discount = (fee * discountPercent) / 100;

        // Compute the final fee after discount
        double finalFee = fee - discount;

        // Print the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        scanner.close();
    }
}