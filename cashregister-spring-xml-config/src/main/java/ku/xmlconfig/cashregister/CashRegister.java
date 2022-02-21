package ku.xmlconfig.cashregister;

public class CashRegister {
    private double purchase; // total amount bought
    private double payment; // total amount paid

    private TaxCalculator taxCalculator;

    public CashRegister(TaxCalculator taxCalculator) {
        this.purchase = 0;
        this.payment = 0;
        this.taxCalculator = taxCalculator;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void calculateTax() {
        purchase = purchase + taxCalculator.calculateTax(purchase);
    }

    public void enterPayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}