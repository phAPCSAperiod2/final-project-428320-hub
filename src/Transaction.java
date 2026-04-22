import java.time.LocalDate;
import java.util.Locale.Category;

/**
 * Represents a single financial transaction.
 * Each transaction records the amount, category, description, and date
 * of a financial activity such as a purchase or income entry.
 *
 * <p>This class acts as a data container used by the BudgetManager
 * to track and analyze spending patterns.</p>
 *
 * @author Allison Ly
 * @Collaborator ChatGPT
 */
public class Transaction {

    private double amount;
    private Category category;
    private String description;
    private LocalDate date;

    /**
     * Constructs a Transaction object.
     *
     * @param amount the monetary value of the transaction
     * @param category the category of the transaction
     * @param description a brief description of the transaction
     * @param date the date the transaction occurred
     */
    public Transaction(double amount, Category category, String description, LocalDate date) {
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    /**
     * Gets the transaction amount.
     *
     * @return the amount of the transaction
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Gets the transaction category.
     *
     * @return the category of the transaction
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Gets the transaction description.
     *
     * @return the description of the transaction
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the transaction date.
     *
     * @return the date of the transaction
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Returns a string representation of the transaction.
     *
     * @return a formatted string containing the date, category, amount, and description
     */
    @Override
    public String toString() {
        return date + " | " + category + " | $" + amount + " | " + description;
    }
}
