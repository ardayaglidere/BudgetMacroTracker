public class FoodItem {
    private String name;
    private double calories;
    private double protein;
    private double carbs;
    private double fat;

    public FoodItem(String name, double calories, double protein, double carbs, double fat) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }

    public String getName() { return name; }
    public double getCalories() { return calories; }
    public double getProtein() { return protein; }
    public double getCarbs() { return carbs; }
    public double getFat() { return fat; }

    @Override
    public String toString() {
        return String.format("%s -> %.0f kcal | Protein: %.1fg | Karbo: %.1fg | Yağ: %.1fg",
                name, calories, protein, carbs, fat);
    }
}

