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
}
