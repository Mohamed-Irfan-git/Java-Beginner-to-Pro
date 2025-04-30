package DSA.Recursion;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        //subSeq("","abc");
//        ArrayList<String > ans =subSeq2("","abc");
//        System.out.println(ans);

        aschiVl("","abc");

    }

    static void subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch ,up.substring(1));
        subSeq(p,up.substring(1));


    }

    static ArrayList<String> subSeq2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subSeq2(p +ch,up.substring(1));
        ArrayList<String> right = subSeq2(p,up.substring(1));

        left.addAll(right);

        return left;

    }

    static void aschiVl(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        aschiVl(p+ch,up.substring(1));
        aschiVl(p,up.substring(1));
        aschiVl(p+(ch+0),up.substring(1));

    }
}
