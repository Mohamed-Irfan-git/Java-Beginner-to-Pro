package DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertionFirst(10);
        list.insertionFirst(15);
        list.insertionFirst(10);
        list.insertionFirst(15);
        list.insert(40,2);
        list.lastInsertion(50);
//        System.out.println(list.deleteFirst());
//
//        System.out.println(list.delete(1));
//        System.out.println(list.deleteLast());

        list.display();


    }
}
