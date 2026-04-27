/**
 * Represents a monthly budget and provides methods
 * to evaluate user-entered spending from BudgetManager.
 *
 * This class is used alongside BudgetManager, which collects
 * transaction data from user input.
 *
 * @author Allison Ly
 * @Collaborator ChatGPT
 */
public class Budget {

    private double monthlyLimit;

    /**
     * Constructs a Budget with a specified monthly limit.
     *
     * @param monthlyLimit the maximum amount the user can spend per month
     */
    public Budget(double monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }

    /**
     * Returns the current monthly budget limit.
     *
     * @return the user's monthly spending limit
     */
    public double getMonthlyLimit() {
        return monthlyLimit;
    }

    /**
     * Updates the monthly budget limit.
     *
     * @param monthlyLimit the new budget limit set by the user
     */
    public void setMonthlyLimit(double monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }

    /**
     * Checks whether user spending is close to the budget limit.
     * "Near limit" is defined as 80% or more of the budget.
     *
     * @param spending total spending calculated from BudgetManager transactions
     * @return true if spending is at least 80% of the budget, false otherwise
     */
    public boolean isNearLimit(double spending) {
        return spending >= monthlyLimit * 0.8;
    }

    /**
     * Checks whether user spending has exceeded the budget limit.
     *
     * @param spending total spending calculated from BudgetManager transactions
     * @return true if spending is greater than the budget limit
     */
    public boolean isExceeded(double spending) {
        return spending > monthlyLimit;
    }

    /**
     * Calculates the next month's budget based on current spending.
     * If overspending occurs, the excess is subtracted from next month's budget.
     *
     * @param spending total spending from BudgetManager
     * @return adjusted budget for the next month
     */
    public double calculateNextMonthBudget(double spending) {
        if (spending > monthlyLimit) {
            double difference = spending - monthlyLimit;
            return monthlyLimit - difference;
        }
        return monthlyLimit;
    }
}
