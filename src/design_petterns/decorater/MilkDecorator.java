package design_petterns.decorater;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffeeName() {
        return super.getCoffeeName() + " ,Milk";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+2;

    }
}
