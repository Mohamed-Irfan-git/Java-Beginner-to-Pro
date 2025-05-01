package DSA.Recursion;

import java.util.ArrayList;

public class Aschii {
    public static void main(String[] args) {
        ArrayList<String> list =subAschi("","abc") ;
        System.out.println(list);

    }
    static ArrayList<String> subAschi(String p,String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> right = subAschi(p,up.substring(1)) ;
        ArrayList<String> left = subAschi(p+ch,up.substring(1)) ;
        ArrayList<String> aschi = subAschi(p +(ch+0),up.substring(1)) ;

         left.addAll(right);
        left.addAll(aschi);
       return left;
    }
}
