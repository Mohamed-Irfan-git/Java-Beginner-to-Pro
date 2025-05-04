package basic.Arrays;

import java.util.Arrays;

public class ArrayChanges {
    public static void main(String[] args) {
        int [] arr = {10,12,15,40,5};
        int [] arr1 = arr.clone();
        arr1 [4]= 20;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));




    }
}
