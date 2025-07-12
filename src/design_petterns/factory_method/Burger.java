package design_petterns.factory_method;

//step 1 create interface
//step 2 implement that interface in to your class
//step 3 create Factory abstract class
//step 4 extend every single sub class using that abstract class
class Burger implements Food{
    @Override
    public void createFood() {
        System.out.println("Burger created");
    }
}

class Pizza implements Food{
    @Override
    public void createFood() {
        System.out.println("Pizza created");
    }
}

class Bread implements Food{
    @Override
    public void createFood() {
        System.out.println("Bread created");
    }
}

//step 3
abstract class FoodFactory{
    public abstract Food createFood();

}


//step 4
class BurgerFactory extends FoodFactory{
    @Override
    public Food createFood() {
        return new Burger();
    }
}

class PizzaFactory extends FoodFactory{
    @Override
    public Food createFood() {
        return new Pizza();
    }
}

class BreadFactory extends FoodFactory{
    @Override
    public Food createFood() {
        return new Bread();
    }
}


