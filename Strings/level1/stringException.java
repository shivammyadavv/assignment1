import java.util.Scanner;



public class stringException {
    public static void generateException(String str) {
        // This will cause StringIndexOutOfBoundsException
        System.out.println("Character at index " + str.length() + ": " + str.charAt(str.length()));
    }

    public static void handleException(String str) {
        try {
            System.out.println("Character at index " + str.length() + ": " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // This will generate the exception and stop the program
        // Uncomment the next line to see abrupt termination
        // generateException(input);

        // This will handle the exception gracefully
        handleException(input);

        sc.close();
    }
}
