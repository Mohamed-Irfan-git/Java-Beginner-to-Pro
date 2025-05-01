package basic.Genarics;

import java.util.ArrayList;
import java.util.List;

public class Genarics <T> {
    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }



    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//        list.add("Kunal Kushwaha");
//        String s = (String) list.get(0);
//        System.out.println(s);

        Genarics<String> g = new Genarics<String>();
        g.set("hello world");
        String s = g.get();
        System.out.println(s);




    }

}
