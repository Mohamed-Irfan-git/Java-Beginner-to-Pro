package DSA.Shorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int [] arr = {10,32,4,8,3,54,2,56,7};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);

    }
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));

    }
}
