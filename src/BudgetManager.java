import java.util.ArrayList;
import java.util.List;

/**
 * This class serves as a budgeting software.
 * It manages a collection of transactions, calculates spending, and provides incite
 * automated financial coaching features such as budget alerts and spending suggestions.
 * * <p>Av key feature of this manager is the "Overspend Penalty" system, which carries over
 * debt from one month to the next to encourage financial discipline.</p>
 * * @author Allison Ly
 * @Collaborator Co-Pilot, ChatGPT, Gemini
 */
public class BudgetManager {

    /** A list to store all transaction records for the current period. */
    private List<Transaction> transactions;

    /** The target maximum spending amount for the month. */
    private double monthlyGoal;

    /** The amount exceeded in the previous month, to be deducted from the current limit. */
    private double overspendDebt;

    /**
     * Constructs a new {@code BudgetManager} with a specified spending target.
     * * @param initialGoal The maximum amount the user intends to spend monthly.
     */
    public BudgetManager(double initialGoal) {
        this.transactions = new ArrayList<>();
        this.monthlyGoal = initialGoal;
        this.overspendDebt = 0.0;
    }
