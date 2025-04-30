package basic.loopsandcondition;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;

//        int temp = b;
//        b=a;
//        a=temp;

        a = a+b;
        b=a-b;
        a=a-b;

        System.out.println(a +" " + b);
    }
}
