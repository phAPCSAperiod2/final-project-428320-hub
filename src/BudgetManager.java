/**
 * The BudgetManager class handles the core logic for a personal finance tracker.
 * It manages a list of transactions, tracks spending against a monthly goal,
 * and provides automated financial advice based on spending habits.
 * * <p>Key features include spending warnings, category-based suggestions,
 * and a "debt" carry-over system for overspent months.</p>
 * * @author YourName
 * @version 1.0
 */
public class BudgetManager {

    /**
     * Adds a new transaction to the manager and performs an immediate
     * budget status check to warn the user of potential overspending.
     * * @param t The {@link Transaction} object to be added to the history.
     */
    public void addTransaction(Transaction t) {
        // Implementation logic...
    }

    /**
     * Calculates the total amount spent across all categories,
     * specifically excluding income (SALARY).
     * * @return The sum of all expense transaction amounts as a double.
     */
    public double getTotalSpending() {
        // Implementation logic...
        return 0.0;
    }

    /**
     * Analyzes current spending levels against the defined monthly goal.
     * Prints a warning if spending exceeds 90% of the limit or an alert
     * if the limit has been surpassed.
     */
    public void checkBudgetStatus() {
        // Implementation logic...
    }

    /**
     * Identifies the category with the highest total expenditure.
     * Outputs a suggestion to the console advising the user to reduce
     * spending in that specific area.
     */
    public void getSuggestions() {
        // Implementation logic...
    }

    /**
     * Finalizes the current month's financial data.
     * If the user overspent, the excess amount is recorded as a debt
     * to be deducted from the following month's available budget.
     * * <p>Note: This method clears the current transaction list for the new month.</p>
     */
    public void endOfMonthProcess() {
        // Implementation logic...
    }
}
