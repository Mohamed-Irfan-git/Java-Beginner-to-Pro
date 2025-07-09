package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 18;
        int [] rsl = twoSum(nums,target);
        System.out.println(Arrays.toString(rsl));

    }
    public static int[] twoSum(int[] nums, int target) {
        int len= nums.length;
        int [] arr = new int [2];

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int total= nums[i]+nums[j];

                if(total==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }

}
