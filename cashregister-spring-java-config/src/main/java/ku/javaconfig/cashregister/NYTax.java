package ku.javaconfig.cashregister;

public class NYTax implements TaxCalculator {
    public double calculateTax(double purchase) {
        if (purchase > 100)
            return purchase * 0.08;
        return 0;
    }
}