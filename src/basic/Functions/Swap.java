package basic.Functions;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] a = {10,13,35};
        swap(a);
        System.out.println(Arrays.toString(a));
    }

    static void swap(int [] a){
        a[0] =30;
    }
}
