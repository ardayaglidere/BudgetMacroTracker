
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   KİŞİSEL BÜTÇE & MAKRO TAKİPÇİSİ v1.0   ");
        System.out.println("==========================================\n");

       
        double dailyCalorieGoal = 2500;
        double dailyProteinGoal = 160;

        List<FoodItem> meals = new ArrayList<>();
        List<Transaction> transactions = new ArrayList<>();

        
        meals.add(new FoodItem("Tavuk Göğsü & Pirinç Pilavi", 550, 48.0, 50.0, 5.0));
        meals.add(new FoodItem("Protein Shake & Muz", 300, 30.0, 35.0, 3.0));

        transactions.add(new Transaction("Aylik Burs / Gelir", 800.0, "Gelir", false));
        transactions.add(new Transaction("Market Alişverişi", 42.50, "Gida", true));
        transactions.add(new Transaction("Spor Salonu Üyeliği", 30.0, "Spor", true));

        
        double totalCal = 0, totalProtein = 0;
        System.out.println("🥗 YENEN YEMEKLER:");
        for (FoodItem item : meals) {
            System.out.println("  • " + item);
            totalCal += item.getCalories();
            totalProtein += item.getProtein();
        }

        System.out.printf("\n📊 MAKRO ÖZETİ: %.0f / %.0f kcal (Kalan: %.0f kcal) | Protein: %.1fg / %.1fg (Kalan: %.1fg)\n",
                totalCal, dailyCalorieGoal, (dailyCalorieGoal - totalCal),
                totalProtein, dailyProteinGoal, (dailyProteinGoal - totalProtein));

        
        double balance = 0;
        System.out.println("\n💰 FINANSAL ISLEMLER:");
        for (Transaction t : transactions) {
            System.out.println("  • " + t);
            if (t.isExpense()) {
                balance -= t.getAmount();
            } else {
                balance += t.getAmount();
            }
        }

        System.out.printf("\n💶 NET BAKIYE: %.2f €\n", balance);
        System.out.println("==========================================");
    }
}

