package leetcode;

public class PalindromNumber {
    public static void main(String[] args) {
        int a= 121;
        System.out.println(palindrome(a));

    }
    public static boolean palindrome(int num){
        int temp = num;
        int len = (int)(Math.log10(num)+1);
        int rev =0;
        for(int i =0; i<len;i++){
            rev=rev*10+num%10;
            num=num/10;

        }
        if(rev==temp){
            return true;
        }
        return false;
    }
}
