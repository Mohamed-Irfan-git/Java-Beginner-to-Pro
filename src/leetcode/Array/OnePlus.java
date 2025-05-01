package leetcode.Array;


import java.util.Arrays;

public class OnePlus {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
       int [] ans= onePlus(arr);
       System.out.println(Arrays.toString(ans));
    }

    static int[] onePlus(int[] arr) {
        long sum = 0;


        for (int i = 0; i < arr.length; i++) {
            sum += (long) (arr[i] * Math.pow(10, arr.length - (i + 1)));
        }

        long onePlus = sum + 1;


        int digit = (int)(Math.log10(onePlus) + 1);

        arr = new int[digit];


        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = (int) (onePlus % 10);
            onePlus /= 10;
        }


       return arr;
    }
}

