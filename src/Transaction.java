import java.time.LocalDate;

/**
 * Represents transactions.
 * A transaction includes an amount, category, description, and date.
 *
 * This class is used by BudgetManager to track and analyze
 * spending patterns across different categories and dates.
 * @Author Allison Ly
 * @Collaborator Co-Pilot, ChatGPT
 */
public class Transaction {

    private double amount;
    private Category category;
    private String description;
    private LocalDate date;

    /**
     * Constructs a Transaction object.
     *
     * @param amount the monetary value of the transaction (positive for expenses)
     * @param category the spending category of the transaction
     * @param description a short description of the transaction
     * @param date the date the transaction occurred
     */
    public Transaction(double amount, Category category, String description, LocalDate date) {
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    /** @return the amount spent */
    public double getAmount() {
        return amount;
    }

    /** @return the category of the transaction */
    public Category getCategory() {
        return category;
    }

    /** @return the description of the transaction */
    public String getDescription() {
        return description;
    }

    /** @return the date the transaction occurred */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Returns a formatted string representation of the transaction.
     *
     * @return a string containing the date, category, amount, and description
     */
    @Override
    public String toString() {
        return date + " | " + category + " | $" + amount + " | " + description;
    }
}
