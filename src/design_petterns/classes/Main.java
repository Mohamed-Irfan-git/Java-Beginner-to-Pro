package design_petterns.classes;

public class Main {
    public static void main(String[] args) {
        User user = new User("Irfan",22);
        System.out.println(user.getName());
        user.setName("Vijay");
        System.out.println(user.getName());
    }
}
