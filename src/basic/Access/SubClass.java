package basic.Access;

public class SubClass extends A{

     @Override
    void fuck(){
        System.out.println("hello wolrd");
    }

    public static void main(String[] args) {
        A a = new A();
        String x =a.getName();
        System.out.println(x);
        SubClass sub = new SubClass();


    }



}
