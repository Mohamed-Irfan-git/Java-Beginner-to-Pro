package design_petterns.factory_method;

public class Main {
    public static void main(String[] args) {
        FoodFactory foodFactory = new PizzaFactory();
        Food food = foodFactory.createFood();
        food.createFood();

        FoodFactory foodFactory2 = new BreadFactory();
        Food food2 = foodFactory2.createFood();
        food2.createFood();

        FoodFactory foodFactory3 = new BurgerFactory();
        Food food3 = foodFactory3.createFood();
        food3.createFood();
    }
}
