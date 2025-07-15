package design_petterns.decorater;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffeeName() {
        return super.getCoffeeName() + " , Sugar ";
    }
    @Override
    public double getPrice() {
        return super.getPrice()+ 0.5;
    }
}
