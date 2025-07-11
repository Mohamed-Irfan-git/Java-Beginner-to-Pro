package design_petterns.oop.interfaces;

public class Main {
    public static void main(String[] args) {
//        TextCalculator2019 textCalculator = new TextCalculator2019();
//        TextCalculator2020 textCalculator2 = new TextCalculator2020();
//        System.out.println(textCalculator.calculate(30,40));
//        System.out.println(textCalculator2.calculate(30,40));
        TextCalculator calculator = calculator();
        System.out.println(calculator.calculate(5, 5));
    }
    public static TextCalculator calculator(){
        return new TextCalculator2019();
    }
}
