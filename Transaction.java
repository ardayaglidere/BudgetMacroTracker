
public class Transaction {
    private String description;
    private double amount;
    private String category;
    private boolean isExpense; // true = Gider, false = Gelir

    public Transaction(String description, double amount, String category, boolean isExpense) {
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.isExpense = isExpense;
    }

    public double getAmount() { return amount; }
    public boolean isExpense() { return isExpense; }

    @Override
    public String toString() {
        String type = isExpense ? "[-] GİDER" : "[+] GELİR";
        return String.format("%s %s: %.2f € (%s)", type, description, amount, category);
    }
}

