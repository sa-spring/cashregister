package ku.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ku.annotation.cashregister.CashRegister;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config-annotation.xml");

        CashRegister register = context.getBean(CashRegister.class);

        register.recordPurchase(100);
        register.calculateTax();
        register.enterPayment(200);
        System.out.println(register.giveChange());
    }
}
