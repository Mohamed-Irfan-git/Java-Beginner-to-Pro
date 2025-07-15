package design_petterns.decorater;

public abstract class CoffeeDecorator implements Coffee{

    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getCoffeeName() {
        return coffee.getCoffeeName();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }
}
