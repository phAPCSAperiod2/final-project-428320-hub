import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

/**
 * Manages a collection of financial transactions.
 * Provides methods to add, remove, and analyze transactions.
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
     * Adds a transaction.
     */
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    /**
     * Removes a transaction.
     */
    public void removeTransaction(Transaction transaction) {
        transactions.remove(transaction);
    }

    /**
     * Gets all transactions.
     */
    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    /**
     * Calculates total balance (income - expenses).
     */
    public double getBalance() {
        double total = 0;
        for (Transaction t : transactions) {
            total += t.getAmount();
        }
        return total;
    }

    /**
     * Gets total for a specific category.
     */
    public double getTotalByCategory(Category category) {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getCategory() == category) {
                total += t.getAmount();
            }
        }
        return total;
    }

    /**
     * Gets transactions for a specific date.
     */
    public List<Transaction> getTransactionsByDate(LocalDate date) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getDate().equals(date)) {
                result.add(t);
            }
        }
        return result;
    }

    /**
     * Prints all transactions.
     */
    public void printAllTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    /**
     * Demo entry point for budget tracking.
     */
    public static void main(String[] args) {
        BudgetManager manager = new BudgetManager();
        Budget budget = new Budget(1000);

        manager.addTransaction(new Transaction(75.50, Category.FORMAT, "Groceries", LocalDate.of(2026, 4, 20)));
        manager.addTransaction(new Transaction(120.00, Category.DISPLAY, "Utilities", LocalDate.of(2026, 4, 15)));
        manager.addTransaction(new Transaction(200.00, Category.DISPLAY, "Car payment", LocalDate.of(2026, 4, 10)));

        System.out.println("Transactions:");
        manager.printAllTransactions();

        double spending = Math.abs(manager.getBalance());
        System.out.println("\nTotal spending: $" + spending);
        System.out.println("Balance: $" + manager.getBalance());
        System.out.println("Near limit: " + budget.isNearLimit(spending));
        System.out.println("Exceeded: " + budget.isExceeded(spending));
        System.out.println("Next month budget: $" + budget.calculateNextMonthBudget(spending));
    }
}
