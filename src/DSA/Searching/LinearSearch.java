package DSA.Searching;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,5,8,9,10};
        int target = 5;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = search3(arr,0,target);
        System.out.println(ans);

    }
    static int search(int[] arr,int index,int num) {
        if(arr.length == index ) {
            return -1 ;

        }
        if(arr[index] == num) {
            return index;
        }
        else {
            return search(arr,index+1,num);
        }


    }

    //using the arraylist i need to return the arraylist of search cases

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> search1(int[] arr,int index,int target) {
        if(arr.length == index ) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return search1(arr,index+1,target);

    }

    static ArrayList<Integer> search2(int[] arr,int index,int target, ArrayList<Integer> list) {
        if(arr.length == index ) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);

        }
        return search2(arr,index+1,target,list);

    }

    static ArrayList<Integer> search3(int[] arr,int index,int target) {

        ArrayList<Integer> list1 = new ArrayList<>();

        if(arr.length == index ) {
            return list1;
        }
        if(arr[index] == target) {
            list1.add(index);
        }

        ArrayList<Integer> ans = search3(arr,index+1,target);
        list1.addAll(ans);
        return list1;
    }


}
