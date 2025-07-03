package collection;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Kunal");
        set.add("irfan");
        set.add("Geethma");

        new HashSet<>(set)
                .forEach(System.out::println);

        Stream<String> str = set.stream();
        str.map(String::toUpperCase)
                .forEach(System.out::println);


//        Set<String> s = new HashSet<String>();
//        for (String a : args)
//            s.add(a);
//        System.out.println(s.size() + " distinct words: " + s);

        Queue<String> queue = new LinkedList<String>();
        queue.add("irfan");
        queue.add("kabali");
        queue.offer("sanga");
        queue.poll();
        System.out.println(queue);

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("pappu");
        deque.addLast("suppu");
        deque.add("malu");
        deque.add("malu");

       Stream<String> stream = deque.stream();
       stream.map(name-> name.toUpperCase())
               .forEach(System.out::println);


        int minGroupSize = Integer.parseInt(args[1]);

        // Read words from file and put into a simulated multimap
        Map<String, List<String>> m = new HashMap<String, List<String>>();

        try {
            Scanner s = new Scanner(new File(args[0]));
            while (s.hasNext()) {
                String word = s.next();
                String alpha = alphabetize(word);
                List<String> l = m.get(alpha);
                if (l == null)
                    m.put(alpha, l=new ArrayList<String>());
                l.add(word);
            }
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }

        // Print all permutation groups above size threshold
        for (List<String> l : m.values())
            if (l.size() >= minGroupSize)
                System.out.println(l.size() + ": " + l);
    }
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }




}
