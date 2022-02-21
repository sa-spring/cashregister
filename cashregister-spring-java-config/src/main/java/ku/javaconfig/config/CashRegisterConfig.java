package ku.javaconfig.config;

import ku.javaconfig.cashregister.CATax;
import ku.javaconfig.cashregister.CashRegister;
import ku.javaconfig.cashregister.NYTax;
import ku.javaconfig.cashregister.TaxCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CashRegisterConfig {
    @Bean
    public CashRegister cashRegister() {
        return new CashRegister(caTaxCalculator());
    }

    @Bean
    public TaxCalculator caTaxCalculator() {
        return new CATax();
    }

    @Bean
    public TaxCalculator nyTaxCalculator() {
        return new NYTax();
    }

}
