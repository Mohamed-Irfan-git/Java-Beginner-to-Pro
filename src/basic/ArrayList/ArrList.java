package basic.ArrayList;

import basic.Access.A;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList extends A {
    public void display(){
        ex2();


    }
    int a = age;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        for (int i = 0; i < 5; i++) {
            list.add(scan.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }


    }
}
