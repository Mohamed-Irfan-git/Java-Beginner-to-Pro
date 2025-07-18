package design_petterns.strategy;

public class ShoppingCart {

    private  PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPrice (double price) {
        paymentStrategy.pay(price);
    }


}
