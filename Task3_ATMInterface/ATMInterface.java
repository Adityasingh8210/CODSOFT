package Task3_ATMInterface;



import java.util.Scanner;

public class ATMInterface {
    private static double balance = 10000.0;
    private static final String correctPIN = "1234";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("🏧 Welcome to CodSoft ATM 🏧");

        System.out.print("🔐 Enter your 4-digit PIN: ");
        String enteredPIN = input.nextLine();

        if (!enteredPIN.equals(correctPIN)) {
            System.out.println("❌ Invalid PIN. Exiting...");
            return;
        }

        int choice;
        do {
            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1️⃣ Check Balance");
            System.out.println("2️⃣ Deposit Money");
            System.out.println("3️⃣ Withdraw Money");
            System.out.println("4️⃣ Exit");
            System.out.print("Choose an option (1-4): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(input);
                    break;
                case 3:
                    withdraw(input);
                    break;
                case 4:
                    System.out.println("👋 Thank you for using CodSoft ATM!");
                    break;
                default:
                    System.out.println("⚠️ Invalid choice! Try again.");
            }
        } while (choice != 4);

        input.close();
    }

    public static void checkBalance() {
        System.out.printf("💰 Current Balance: ₹%.2f\n", balance);
    }

    public static void deposit(Scanner input) {
        System.out.print("💵 Enter amount to deposit: ₹");
        double amount = input.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposit successful!");
            checkBalance();
        } else {
            System.out.println("❌ Invalid amount.");
        }
    }

    public static void withdraw(Scanner input) {
        System.out.print("🏧 Enter amount to withdraw: ₹");
        double amount = input.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawal successful!");
            checkBalance();
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }
}

