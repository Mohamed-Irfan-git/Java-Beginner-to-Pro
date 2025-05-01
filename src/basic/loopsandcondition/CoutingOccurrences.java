package basic.loopsandcondition;

public class CoutingOccurrences {
    public static void main(String[] args) {
        int a = 1461644;
        int count = 0;

        while (a > 0){
            int rem = a%10;
            if(rem==4){
                count++;
            }

            a = a/10;
        }
        System.out.println(count);
    }
}
