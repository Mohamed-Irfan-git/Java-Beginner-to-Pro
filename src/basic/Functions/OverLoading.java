package basic.Functions;

public class OverLoading {
    public static void main(String[] args) {
        fun(15);
    }
    static  void fun(int x){
        System.out.println(x);
    }

    static  void fun(String x){
        System.out.println(x);
    }

}
