package DSA.Shorting;

import java.util.Arrays;

public class MergeShort {
    public static void main(String[] args) {
        int [] arr = {10,6,9,87,9,36,21,53};
        arr= merge(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] merge(int[] arr) {
        int mid = arr.length/2;

        if(arr.length==1){
            return arr;
        }
        int[] arr1 = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] arr2 = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return shorted(arr1,arr2);

    }

    private static int[] shorted(int[] arr1, int[] arr2) {
        int first = arr1.length;
        int second = arr2.length;
        int[] mix = new int[first+second];

        int i =0;
        int j=0;
        int k=0;

        while(i<first&&j<second){
            if(arr1[i]<arr2[j]){
                mix[k]=arr1[i];
                i++;

            }else{
                mix[k]=arr2[j];
                j++;

            }

            k++;
        }
        while(i<first){
            mix[k]=arr1[i];
            i++;
            k++;
        }
        while(j<second){
            mix[k]=arr2[j];
            j++;
            k++;

        }
        return mix;
    }
}
