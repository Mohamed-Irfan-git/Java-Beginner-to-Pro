package DSA.Shorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int [] arr = {10,32,4,8,3,54,2,56,7};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);


    }
    static void bubbleSort(int [] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));

    }
}
