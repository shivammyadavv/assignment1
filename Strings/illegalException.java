import java.util.Scanner;



public class illegalException {
    static void generateException(String str) {
        // This will throw a runtime exception (StringIndexOutOfBoundsException)
        System.out.println(str.substring(5, 2));
    }

    static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // This will cause the program to terminate due to unhandled exception
        // Uncomment the next line to see abrupt termination
        // generateException(input);

        // This will handle the exception gracefully
        handleException(input);
    }
}
