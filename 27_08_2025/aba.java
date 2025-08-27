public class aba {
   
        static int balance = 0;
    
        public static void deposit(int amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount");
            }
        }
    
        public static void withdraw(int amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Invalid or insufficient amount to withdraw");
            }
        }
    
        public static void printBalance() {
            System.out.println("Final Balance: " + balance);
        }
    
        public static void main(String[] args) {
            deposit(500);
            withdraw(200);
            deposit(300);
            withdraw(1000);
            printBalance();
        }
    }
    
    
