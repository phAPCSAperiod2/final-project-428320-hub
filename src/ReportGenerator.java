import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Generates analytical reports based on a list of transactions.
 *
 * This class provides summaries such as spending by category,
 * spending within a date range, and basic statistics.
 *
 * @Author Allison Ly
 * @Collaborator Co-Pilot, ChatGPT
 */
public class ReportGenerator {

    private List<Transaction> transactions;

    /**
     * Constructs a ReportGenerator using an existing list of transactions.
     *
     * @param transactions the list of transactions to analyze
     */
    public ReportGenerator(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    /**
     * Calculates total spending for each category.
     *
     * @return a map of Category → total amount spent
     */
    public Map<Category, Double> getSpendingByCategory() {
        Map<Category, Double> totals = new HashMap<>();

        // Initialize all categories to 0
        for (Category c : Category.values()) {
            totals.put(c, 0.0);
        }

        // Add amounts
        for (Transaction t : transactions) {
            double current = totals.get(t.getCategory());
            totals.put(t.getCategory(), current + t.getAmount());
        }

        return totals;
    }

    /**
     * Returns all transactions between two dates (inclusive).
     *
     * @param start the start date
     * @param end the end date
     * @return a list of matching transactions
     */
    public List<Transaction> getTransactionsInRange(LocalDate start, LocalDate end) {
        return transactions.stream()
                .filter(t -> !t.getDate().isBefore(start) && !t.getDate().isAfter(end))
                .collect(Collectors.toList()); // Java 8 compatible
    }

    /**
     * Finds the highest single transaction.
     *
     * @return the transaction with the largest amount, or null if none exist
     */
    public Transaction getHighestTransaction() {
        return transactions.stream()
                .max((a, b) -> Double.compare(a.getAmount(), b.getAmount()))
                .orElse(null);
    }

    /**
     * Calculates the average transaction amount.
     *
     * @return the average amount spent, or 0 if no transactions exist
     */
    public double getAverageTransaction() {
        if (transactions.isEmpty()) return 0;

        double total = 0;
        for (Transaction t : transactions) {
            total += t.getAmount();
        }
        return total / transactions.size();
    }
}
