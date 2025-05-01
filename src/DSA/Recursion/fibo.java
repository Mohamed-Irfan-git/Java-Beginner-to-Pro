package DSA.Recursion;

public class fibo {
    public static void main(String[] args) {
//System.out.println(fib(50));
        System.out.println(fibo1(3));
    }
    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    static int fibo1(int n){
        return (int)Math.pow(((1+Math.sqrt(5))/2),n);
    }
}
