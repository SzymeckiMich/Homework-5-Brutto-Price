public class VATcalc {

    private double priceWithVAT(Product product) {
        return product.getNettoPrice() + product.getNettoPrice() * (vatBase(product.getCategory()) / 100);
    }

    public void showInfo(Product product) {
        System.out.println("Cena netto " + product.getName() + " to " + product.getNettoPrice() + "zł");
        System.out.println("Podatek VAT na " + product.getName() + " to " + vatBase(product.getCategory()) + "%");
        System.out.println("Cena z brutto to: " + priceWithVAT(product) + "zł\n");
    }

    private double vatBase(String category) {
        switch (category) {
            case "Pojazd":
                return 12;
            case "Żywność":
                return 8;
            default:
                return 10;
        }
    }
}
