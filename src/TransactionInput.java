import java.util.Scanner;

public class TransactionInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to describe the transaction
        String[] transactionNames = new String[5];
        double[] amounts = new double[5];
        String[] transactionDates = new String[5];

        int transactionCount = 0;
        while (true) {
            transactionCount++;
            System.out.println("Transaction " + transactionCount + ":");

            System.out.print("Enter the transaction name: ");
            transactionNames[transactionCount - 1] = scanner.nextLine();

            System.out.print("Enter the transaction amount: ");
            amounts[transactionCount - 1] = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter the transaction date (YYYY-MM-DD): ");
            transactionDates[transactionCount - 1] = scanner.nextLine();

            if (transactionCount == 5) {
                break; // Exit the loop after 5 transactions
            }
        }

        System.out.println("\nTransaction Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Transaction " + (i + 1) + ": " + transactionNames[i] + " - $" + amounts[i] + " on " + transactionDates[i]);
        }

        scanner.close();
    }
}
