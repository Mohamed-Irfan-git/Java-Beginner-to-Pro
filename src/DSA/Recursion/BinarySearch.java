package DSA.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2,4,6,10,65,78,83};
        int target = 83;
        System.out.println(search(arr,target,0,arr.length-1));

    }
    static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
//        if(start==end){
//            return start;
//        }

        int m = start+(end-start)/2;

        if(arr[m]==target){
            return m;
        }

        if(arr[m]>target){
            return search(arr,target,start,m-1);
        }
        return search(arr,target,m+1,end);

    }
}
