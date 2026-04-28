/**
 * Represents a monthly budget and provides methods to evaluate
 * user spending and calculate adjustments for the next month.
 *
 *This class works with BudgetManager to determine whether
 * spending is near or exceeds the user's monthly limit.
 * @Author Allison Ly
 * @Collaborator Co-Pilot, ChatGPT
 */
public class Budget {

    private double monthlyLimit;

    /**
     * Constructs a Budget with a specified monthly spending limit.
     *
     * @param monthlyLimit the maximum amount the user can spend per month
     */
    public Budget(double monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }

    /** @return the user's monthly spending limit */
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
     * Determines whether spending is close to the budget limit.
     * "Near limit" is defined as 80% or more of the monthly limit.
     *
     * @param spending the total spending for the month
     * @return true if spending is at least 80% of the limit
     */
    public boolean isNearLimit(double spending) {
        return spending >= monthlyLimit * 0.8;
    }

    /**
     * Determines whether spending has exceeded the budget limit.
     *
     * @param spending the total spending for the month
     * @return true if spending is greater than the monthly limit
     */
    public boolean isExceeded(double spending) {
        return spending > monthlyLimit;
    }

    /**
     * Calculates the next month's budget based on current spending.
     * If the user overspent, the excess amount is subtracted from
     * next month's budget. The result will never be negative.
     *
     * @param spending the total spending for the current month
     * @return the adjusted budget for the next month
     */
    public double calculateNextMonthBudget(double spending) {
        if (spending > monthlyLimit) {
            double difference = spending - monthlyLimit;
            return Math.max(0, monthlyLimit - difference);
        }
        return monthlyLimit;
    }
}
