package DSA.Recursion;

public class Fact {
    public static void main(String[] args) {
        System.out.println(fact(1));


    }
    static int fact(int n){
        if(n<2){
            return n;
        }
        return n * (fact(n-1));

    }
}
