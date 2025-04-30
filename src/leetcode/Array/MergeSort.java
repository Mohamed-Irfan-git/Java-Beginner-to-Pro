package leetcode.Array;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int [] arr2 ={2,5,6};
       merge(arr1,3,arr2,3);

    }
    static void merge(int[] nums1,int m, int[] nums2, int n) {
        int i = m - 1;         // Last valid element in nums1
        int j = n - 1;         // Last element in nums2
        int k = m + n - 1;     // Last position in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }

        // If elements left in nums2, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }


        System.out.println(Arrays.toString(nums1));
    }
}
