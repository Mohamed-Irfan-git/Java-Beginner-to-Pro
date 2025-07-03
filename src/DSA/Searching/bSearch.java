package DSA.Searching;

public class bSearch {
    public static void main(String[] args) {
        int []  arr ={10,12,15,26,36};
        int end = arr.length-1;
        search(arr,0,end,36);
    }

    public static void search(int [] arr,int start,int end,int target){

       int mid = (start+end)/2;
       if(start>end){
           return ;
       }

       if(arr[mid]== target){
           System.out.println("This is Index : " +mid);
           System.out.println("This is Search value : " + arr[mid]);
       }
       else{
           if(arr[mid]>target){
               search(arr,start,end-1,target);
           }
           else{
               search(arr,mid+1,end,target);
           }

       }

    }


}

