package DSA.Searching;

public class RotateBinarySearch {
    public static void main(String[] args) {
        int [] arr = {10,42,53,22,4,8};
        int ans = se(arr,0,(arr.length-1),4);
        System.out.println(ans);

    }

    static int se(int[] arr,int start,int end,int target){
        int m = start + (end-start)/2;
       if(start>end){
           return -1;
       }

        if(arr[m]==target){
            return m;
        }
        if(arr[start]<=arr[m]){
            if(arr[start]<=target && arr[m]>=target){
                return se(arr,start,m-1,target);
            }
            else{
                return se(arr,m+1,end,target);
            }
        }
        if(arr[m]<=target && arr[end]>=target){
            return se(arr,m+1,end,target);
        }
        return se(arr,start,m-1,target);

    }
}
