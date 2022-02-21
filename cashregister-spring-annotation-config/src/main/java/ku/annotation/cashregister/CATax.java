package ku.annotation.cashregister;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CATax implements TaxCalculator {
    public double calculateTax(double purchase) {
        return purchase * 0.075;
    }
}