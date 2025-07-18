package design_petterns.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double price) {
        System.out.println("Payed "+price+" Using credit card" );
    }
}
