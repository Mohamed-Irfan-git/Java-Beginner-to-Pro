package design_petterns.adapter.payment_method;

public class Main {
    public static void main(String[] args) {
       Customer irfan = new Customer("irfan","1111-698878-8977");
       ModernPaymentProcessor modern = new ModernAdapter();
       modern.pay(irfan,60000);
    }
}
