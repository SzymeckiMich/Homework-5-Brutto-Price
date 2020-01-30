public class Shop {
    public static void main(String[] args) {
        VATcalc calc = new VATcalc();
        VatBase base = new VatBase();
        Product prod1 = new Product("Samolot", "Do latania",1999, "Pojazd");
        Product prod2 = new Product("Twarożek", "Do zjedzenia", 2.30, "Żywność");
        Product prod3 = new Product("Snopowiązałka","Do snopów wiązania", 100000,
                "Maszyny rolnicze");

        calc.showInfo(prod1);
        calc.showInfo(prod2);
        calc.showInfo(prod3);
    }
}