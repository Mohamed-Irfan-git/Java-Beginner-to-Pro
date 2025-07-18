package design_petterns.strategy;

public class PaypalPayment implements PaymentStrategy{
    @Override
    public void pay(double price) {
        System.out.println("Payment "+price+" Using Paypal" );
    }
}
