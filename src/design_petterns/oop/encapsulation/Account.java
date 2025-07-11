package design_petterns.oop.encapsulation;

public class Account {
    private String name;
    private Long Balance;

    public String getName() {
        return name;
    }

    public Long getBalance() {
        if(Balance>400){
            return Balance;
        }
        else {
            System.out.println("Not enough balance");
            return Balance;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(Long balance) {
        Balance = balance;
    }

    public Account(String name, Long Balance) {
        this.name = name;
        this.Balance = Balance;
    }


}
