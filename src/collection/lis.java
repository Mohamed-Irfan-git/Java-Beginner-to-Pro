package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class lis {
    public static void main(String[] args) {
        List <String> list = new ArrayList<String>();
        list.add("Kunal dhoni");
        list.add("Kushwaha");
        list.add("Kunal");


//        System.out.println(list.retainAll(list));
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Stream<String> stream = list.stream();
        stream.filter(name ->name.contains("Irfan"))
                .forEach(System.out::println);

        Stream<String> stream1 = list.stream();
        stream1.map(name ->name.replaceFirst("Irfan","Mohammed Irfan"))
                .forEach(System.out::println);



    }
}
