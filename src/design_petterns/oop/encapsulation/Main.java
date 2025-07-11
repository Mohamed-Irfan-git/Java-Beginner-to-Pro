package design_petterns.oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        details("irfan",50L);
    }

    public static void details(String name,Long balance){
        Account account = new Account(name, balance);
        System.out.println(account.getName());
        System.out.println(account.getBalance());

        account.setName("Virat Kohli");
        account.setBalance(3000000L);
        System.out.println(account.getName());
        System.out.println(account.getBalance());
    }
}
