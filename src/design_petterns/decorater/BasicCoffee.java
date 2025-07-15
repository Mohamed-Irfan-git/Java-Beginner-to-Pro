package design_petterns.decorater;

public class BasicCoffee implements Coffee {

    @Override
    public String getCoffeeName() {
        return "Basic Coffee";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
