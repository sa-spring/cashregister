package ku.javaconfig.cashregister;

public class CATax implements TaxCalculator {
    public double calculateTax(double purchase) {
        return purchase * 0.075;
    }
}