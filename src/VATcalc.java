public class VATcalc {
    VatBase vat = new VatBase();
    double priceWithVAT(Product product) {
        return product.getNettoPrice()+product.getNettoPrice()*(vat.vat(product.getCategory())/100);
    }
     void showInfo(Product product){
         System.out.println("Cena netto " + product.getName() + " to "+ product.getNettoPrice()+"zł");
         System.out.println("Podatek VAT na " + product.getName() + " to " + vat.vat(product.getCategory())+"%");
         System.out.println("Cena z brutto to: " + priceWithVAT(product)+"zł\n");
     }
}
