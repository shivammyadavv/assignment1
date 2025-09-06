import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String str = Integer.toString(number);
        int n = str.length();
        int[] digits = new int[n];

        for (int i = 0; i < n; i++) digits[i] = str.charAt(i) - '0';

        System.out.print("Reversed Number: ");
        for (int i = n - 1; i >= 0; i--) System.out.print(digits[i]);
    }
}
