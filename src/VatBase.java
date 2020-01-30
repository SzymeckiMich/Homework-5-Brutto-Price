public class VatBase {
    double vat(String category){
        switch(category){
            case "Pojazd": return 12;
            case "Żywność": return 8;
            default: return  100;
        }
    }
}
