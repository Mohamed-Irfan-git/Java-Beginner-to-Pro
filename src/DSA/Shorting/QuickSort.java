package DSA.Shorting;

import java.util.Arrays;

class QuickSort{
    public static void main(String[] args) {

        int [] arr = {10,6,9,87,9,36,21,53};
        int start = 0;
        int end = arr.length-1;
        quickSort(arr,start,end);
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        int pivot = arr[mid];

        int s = start;
        int e = end;

        while(s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        quickSort(arr,start,e);
        quickSort(arr,s,end);
    }
    static void swap(int arr[],int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e]= temp;
    }

}