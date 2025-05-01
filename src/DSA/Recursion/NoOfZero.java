package DSA.Recursion;

public class NoOfZero {
    public static void main(String[] args) {
       //3504053
        System.out.println(countZeros(35040530));

    }

    static long countZeros(int num) {
       long count = 0;
       return helper(num,count);
    }
    static long helper(long n, long count) {
        if(n == 0){
            return count;

        }
        if(n%10 == 0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);

    }
}
