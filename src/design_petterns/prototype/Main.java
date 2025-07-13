package design_petterns.prototype;

public class Main {
    public static void main(String[] args) {
        School school = new School("irfan","Paragahawela");
        School copy = school.clone();
        
        System.out.println(copy);
        System.out.println(school);
    }
}
