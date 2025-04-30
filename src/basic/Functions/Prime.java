package basic.Functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
        boolean ans = isPrime(15);
        System.out.println(ans);
    }
    static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        int c = 2;
        while (c*c <= a){
            if (a%2==0){
                return false;

            }
            c++;

        }
        if(c*c>=a){
            return true;
        }
        return false;

    }
}
