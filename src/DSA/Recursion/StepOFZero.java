package DSA.Recursion;

public class StepOFZero {
    public static void main(String[] args) {
        System.out.println(step(14));

    }
    static int step(int n) {
       int count=0;
       return helper(n,count);
    }
    static int helper(int n, int count) {
        if(n == 0){
            return count;
        }
        if(n%2 == 0){
            return helper(n/2,count+1);

        }
        return helper(n-1,count+1);
    }

}
