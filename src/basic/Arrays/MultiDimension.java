package basic.Arrays;


import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        int [] []arr = {
                {1,2,3},
                {4,5},
                {6,8,9,10}
        };
        System.out.println(arr[0][0]);

//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//
//        }

//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//
//        }


        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));

        }


    }
}
