package basic.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Object {
    public static void main(String[] args) {
        String [] arr = new String[5];

        for (int i =0; i< arr.length ; i++){
            Scanner scan = new Scanner(System.in);
            arr[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(arr));
    }
}
