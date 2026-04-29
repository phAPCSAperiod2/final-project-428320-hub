import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Manages a collection of financial transactions.
 * Provides methods to add, remove, filter, and analyze spending.
 *
 * This class works with Budget, Transaction, and ReportGenerator
 * to create a complete budgeting system.
 *
 * @Author Allison Ly
 * @Collaborator Co-Pilot, ChatGPT
 */
public class BudgetManager {

    private List<Transaction> transactions;

    /**
     * Constructs a BudgetManager with an empty transaction list.
     */
    public BudgetManager() {
        transactions = new ArrayList<>();
    }

    /**
     * Adds a new transaction to the list.
     *
     * @param transaction the transaction to add
     */
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    /**
     * Removes a transaction from the list.
     *
     * @param transaction the transaction to remove
     */
    public void removeTransaction(Transaction transaction) {
        transactions.remove(transaction);
    }

    /**
     * Returns all stored transactions.
     *
     * @return a list of all transactions
     */
    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    /**
     * Calculates the total spending for the month.
     * Only positive amounts are counted as expenses.
     *
     * @return the total amount spent
     */
    public double getTotalSpending() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getAmount() > 0) {
                total += t.getAmount();
            }
        }
        return total;
    }

    /**
     * Prints all transactions to the console.
     */
    public void printAllTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    /**
     * Allows the user to enter transactions interactively.
     * The user can enter multiple transactions until they type "done".
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BudgetManager manager = new BudgetManager();

        System.out.print("Enter your monthly budget limit: ");
        double limit = input.nextDouble();
        input.nextLine(); // clear buffer

        Budget budget = new Budget(limit);

        System.out.println("\nEnter your transactions.");
        System.out.println("Type 'done' at any time to finish.\n");

        while (true) {
            System.out.print("Amount: ");
            String amountStr = input.nextLine();

            if (amountStr.equalsIgnoreCase("done")) {
                break;
            }

            double amount = Double.parseDouble(amountStr);

            System.out.println("Choose a category:");
            for (Category c : Category.values()) {
                System.out.println("- " + c);
            }
            System.out.print("Category: ");
            Category category = Category.valueOf(input.nextLine().toUpperCase());

            System.out.print("Description: ");
            String description = input.nextLine();

            System.out.print("Date (YYYY-MM-DD): ");
            LocalDate date = LocalDate.parse(input.nextLine());

            manager.addTransaction(new Transaction(amount, category, description, date));

            System.out.println("Transaction added.\n");
        }

        System.out.println("\nAll Transactions:");
        manager.printAllTransactions();

        double spending = manager.getTotalSpending();
        System.out.println("\nTotal spending: $" + spending);
        System.out.println("Near limit: " + budget.isNearLimit(spending));
        System.out.println("Exceeded: " + budget.isExceeded(spending));
        System.out.println("Next month budget: $" + budget.calculateNextMonthBudget(spending));

        // ---------------------------------------------------------
        // NEW REPORTING SECTION USING ReportGenerator
        // ---------------------------------------------------------
        ReportGenerator report = new ReportGenerator(manager.getAllTransactions());

        System.out.println("\n===== REPORTS =====");

        System.out.println("\nSpending by Category:");
        report.getSpendingByCategory().forEach((cat, total) ->
                System.out.println(cat + ": $" + total));

        System.out.println("\nHighest Transaction:");
        Transaction highest = report.getHighestTransaction();
        if (highest != null) {
            System.out.println(highest);
        } else {
            System.out.println("No transactions recorded.");
        }

        System.out.println("\nAverage Transaction Amount: $" + report.getAverageTransaction());

        input.close();
    }
}
