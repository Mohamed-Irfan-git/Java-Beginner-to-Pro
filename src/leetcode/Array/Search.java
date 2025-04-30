package leetcode.Array;

class Search {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        int val =7;
        System.out.println(search(arr, val));
    }
    static int search(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        if(arr[end]<target){
            return end+1;
        }
        while(start <= end) {
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target) {
                start = mid+1;

            }
            else {
                end = mid-1;

            }
            mid = start + (end-start)/2;
        }
        return end+1;


    }
}