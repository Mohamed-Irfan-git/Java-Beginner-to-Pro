package design_petterns.adapter.payment_method;

public class Customer {
    private final String name;
    private final String cardNo;


    public Customer(String name, String cardNo) {
        this.name = name;
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public String getCardNo() {
        return cardNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }
}
