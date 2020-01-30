public class Product {
    private String name;
    private String description;
    private double nettoPrice;
    private String category;

    public Product(String name, String description, double nettoPrice, String category) {
        this.name = name;
        this.description = description;
        this.nettoPrice = nettoPrice;
        this.category = category;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getNettoPrice() {
        return nettoPrice;
    }

    public String getCategory() {
        return category;
    }
}
