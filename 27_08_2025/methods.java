import java.util.*;
public class methods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Enter number of Studengts: ");
            int numberOfStudents = sc.nextInt();

            int student = 1;
            while(student <= numberOfStudents){
                    System.out.print("\n Enter the number of Books borrowed: ");
                    int numOfBooks=sc.nextInt();
                    int totalFine =0;
                    for(int i=1;i<=numOfBooks;i++){
                        System.out.print("\n Enter the category of book borrowed" +i);
                        int category=sc.nextInt();
                        String categoryName;
                        switch(category){
                            case 1: categoryName = "Regular"; break;
                            case 2: categoryName = "Reference"; break;
                            case 3: categoryName = "Magazine"; break;
                            default: categoryName = "Unknown"; break;
                        }

                        System.out.print("\n Enter the number of days book borrowed: "+i);
                        int daysLate = sc.nextInt();
                        int fine = 0;

                        if(daysLate>=0&&daysLate<=5){
                            fine = daysLate * 2;
                        } else if(daysLate>=6 && daysLate<=10){
                            fine = daysLate * 5;
                        } else if(daysLate>10){
                            fine = daysLate * 10;
                        } else {
                            fine = 0;
                        }
                        System.out.println("Book " + i + ": Category: " + categoryName + ", Days Late: " + daysLate + ", Fine: $" + fine);
                        totalFine += fine;

                    }
                    System.out.println("Total fine for Student " + student + ": $" + totalFine);
                    student++;
            }
            System.out.println("\n Do you want to continue? (yes/no): " );
        } 
        while(sc.next().equalsIgnoreCase("yes"));
        sc.close();
    }
}
