package leetcode.Array;

import java.util.Arrays;

public class RemoveEle {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int ans=  removeElement(arr, 5);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
     static int  removeElement(int[] nums, int val) {

        int count = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }

        }
        return count;


    }

}
