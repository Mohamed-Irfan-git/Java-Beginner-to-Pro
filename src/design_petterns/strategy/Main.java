package design_petterns.strategy;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy( new CreditCardPayment());
        cart.setPrice(2500.00);

    }
}
