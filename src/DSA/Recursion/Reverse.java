package DSA.Recursion;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(re2(183));

    }

    static int sum = 0;

    static int re(int n) {
        if (n == 0) {
            return sum;

        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        re(n / 10);
        return sum;
    }

    static int re2(int n) {
        int digit= (int)(Math.log10(n))+1;
        return helper(n,digit);
    }

    private static int helper(int n, int digit) {

        if(n==0){
            return n;
        }
        return (int)((n%10 * Math.pow(10,digit-1))+helper(n/10,digit-1));
    }
}



   