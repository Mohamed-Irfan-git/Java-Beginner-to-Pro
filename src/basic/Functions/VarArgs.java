package basic.Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(15,30,40,50,80,12,32);
        multiple(10,30,"irfan","kholi");
    }

    static void multiple(int a ,int b , String...v){
        System.out.println(Arrays.toString(v)+a+b);

    }

    static  void fun(int...v){
        System.out.println(Arrays.toString(v));

    }
}
