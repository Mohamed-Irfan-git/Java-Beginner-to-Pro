package design_petterns.adapter.payment_method;

public interface ModernPaymentProcessor {
    void pay(Customer customer,double amount);
}
