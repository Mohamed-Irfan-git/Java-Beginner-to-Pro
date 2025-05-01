package basic.Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int [] arr = {54,35,98,48,42};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
     static void reverse(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

     }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
