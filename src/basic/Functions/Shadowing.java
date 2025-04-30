package basic.Functions;

public class Shadowing {
    static int a = 90;
    public static void main(String[] args) {
        System.out.println(a);

        int x = 40;
        System.out.println(x);
        func();

    }
    static void func(){
        System.out.println(a);
        System.out.printf("pie : %.3f",5.3);
    }
}
