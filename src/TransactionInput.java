import java.util.Scanner;
public class TransactionInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to describe the transaction
        String transactionName;
        double amount;
        String transactionDate;

        // Input via the console
        System.out.print("Enter the transaction name: ");
        transactionName = scanner.nextLine();

        System.out.print("Enter the transaction amount: ");
        amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the transaction date (YYYY-MM-DD): ");
        transactionDate = scanner.nextLine();

        // Output the information to the console in one line
        System.out.println("Transaction Details: " + transactionName + " - $" + amount + " on " + transactionDate);

        scanner.close();
    }
}

