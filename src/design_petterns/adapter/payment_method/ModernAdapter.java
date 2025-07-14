package design_petterns.adapter.payment_method;

public class ModernAdapter implements ModernPaymentProcessor {
    private final OldBankApi oldBankApi;

     public ModernAdapter() {
        oldBankApi = new OldBankApi();
    }
    @Override
    public void pay(Customer customer, double amount) {
         oldBankApi.makePayment(customer.getName(),customer.getCardNo(),amount);

    }
}
