package ku.xmlconfig;

import ku.xmlconfig.cashregister.CashRegister;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        CashRegister register = context.getBean("register", CashRegister.class);

        register.recordPurchase(100);
        register.calculateTax();
        register.enterPayment(200);
        System.out.println(register.giveChange());
    }
}