package DSA.Shorting;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int [] arr = {5,3,9,6,2};
        System.out.println(Arrays.toString(sorrt(arr)));


    }
    static int [] sorrt (int[] arr) {
        int length = arr.length;

        for(int i=1;i<length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

}
