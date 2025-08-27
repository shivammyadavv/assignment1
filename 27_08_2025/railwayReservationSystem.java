import java.util.Scanner;

public class railwayReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seatsAvailable = 5;
        int waitingList = 3;
        int totalCapacity = seatsAvailable + waitingList;

        int trainOption;
        int fare = 0;
        String trainName = "";

        System.out.println("Select Train:\n1. Express (Rs. 150)\n2. Superfast (Rs. 200)\n3. Local (Rs. 100)");
        trainOption = sc.nextInt();

        switch (trainOption) {
            case 1:
                trainName = "Express";
                fare = 150;
                break;
            case 2:
                trainName = "Superfast";
                fare = 200;
                break;
            case 3:
                trainName = "Local";
                fare = 100;
                break;
            default:
                System.out.println("Invalid train option. Exiting.");
                return;
        }

        System.out.println("Train Selected: " + trainName + " | Fare: Rs. " + fare);
        System.out.println("Starting Booking...");

        int bookingAttempts = 0;
        do {
            int passengers;
            System.out.print("Enter number of passengers to book: ");
            passengers = sc.nextInt();

            for (int i = 0; i < passengers; i++) {
                if (seatsAvailable > 0) {
                    seatsAvailable--;
                    System.out.println("Seat booked. Seats left: " + seatsAvailable);
                } else if (waitingList > 0) {
                    waitingList--;
                    System.out.println("Seat full. Added to waiting list. Waiting slots left: " + waitingList);
                } else {
                    System.out.println("No seats or waiting list slots available.");
                    break;
                }
            }

            bookingAttempts++;

        } while ((seatsAvailable > 0 || waitingList > 0) && bookingAttempts < totalCapacity);

        System.out.println("Train is full. No more bookings can be made.");
        sc.close();
    }
}

