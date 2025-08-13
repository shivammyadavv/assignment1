public class volume {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        double volume = Math.PI * radius * radius * height;
        System.out.printf("Volume of cylinder: %.2f\n", volume);

        scanner.close();
    }
}
