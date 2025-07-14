package design_petterns.adapter.payment_method;

public class OldBankApi {
    public void makePayment(String name,String cardNo,double amount) {
        System.out.println("Paying... "+amount+" For customer "+name +" using "+cardNo);
    }
}
