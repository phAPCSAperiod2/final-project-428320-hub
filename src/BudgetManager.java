import java.util.ArrayList;
import java.util.List;

public class BudgetManager {
    // use a List to store all our Transaction objects
    private List<Transaction> transactions;

    public BudgetManager() {
        this.transactions = new ArrayList<>();
    }

