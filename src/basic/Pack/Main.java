package basic.Pack;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(15,"sithi",5000);
        Human sd = new Human(15,"sithi",5000);
        System.out.println(Human.population);
        fun1();
    }

    static void fun1(){
        Main obj = new Main();
        obj.fun();

    }

    void fun(){
        fun2();
    }

    void fun2(){
        System.out.println("heelo");
    }
}
