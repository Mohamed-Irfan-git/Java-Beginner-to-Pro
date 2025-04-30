package DSA.Recursion;

public class Sorted {
    public static void main(String[] args) {
        int [] arr= {1,2,3,15,5};
        boolean bol = isSorted(arr,0);
        System.out.println(bol);

    }
    static boolean isSorted(int [] arr,int n) {
        if((arr.length-1) ==n ){
            return true;
        }

        return ((arr[n]<arr[n+1])&&isSorted(arr,n+1));

    }
}
