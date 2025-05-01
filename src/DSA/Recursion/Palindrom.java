package DSA.Recursion;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom());
    }
    static int rev(int n) {
        int digit = (int)(Math.log10(n)+1);
        return helper(n,digit);
    }
    static int helper(int n,int digit ) {

        if (n==0){
            return n;

        }
        return  (int)((n%10 * Math.pow(10,digit-1))+helper(n/10,digit-1));

    }
    static boolean isPalindrom() {
        int n= 12321;
        int ans = rev(n);
        return ans == n;
    }
}
