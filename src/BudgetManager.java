import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;
import java.util.stream.Collectors;

public class BudgetManager {
    private List<Transaction> transactions;

    public BudgetManager() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public List<Transaction> getTransactionsByCategory(Category category) {
        return transactions.stream()
                .filter(t -> t.getCategory() == category)
                .collect(Collectors.toList());
    }
}
