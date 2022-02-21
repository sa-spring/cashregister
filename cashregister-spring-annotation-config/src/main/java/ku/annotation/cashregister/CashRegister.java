package ku.annotation.cashregister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CashRegister {
    private double purchase; // total amount bought
    private double payment; // total amount paid

    private TaxCalculator taxCalculator;
    private String location;

    @Autowired
    public CashRegister(TaxCalculator taxCalculator,
            @Value("${location}") String location) {
        this.purchase = 0;
        this.payment = 0;
        this.taxCalculator = taxCalculator;
        this.location = location;
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