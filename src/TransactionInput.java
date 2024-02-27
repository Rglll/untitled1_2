import java.util.Scanner;

public class TransactionInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store transaction information
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

        searchTransactionsByDateRange(transactionNames, amounts, transactionDates, "2024-02-01", "2024-02-28");

        scanner.close();
    }

    public static void searchTransactionsByDateRange(String[] names, double[] amounts, String[] dates, String startDate, String endDate) {
        System.out.println("\nTransactions within the selected date range (" + startDate + " to " + endDate + "):");
        for (int i = 0; i < names.length; i++) {
            if (dates[i].compareTo(startDate) >= 0 && dates[i].compareTo(endDate) <= 0) {
                System.out.println(names[i] + " - $" + amounts[i] + " on " + dates[i]);
            }
        }
    }
}