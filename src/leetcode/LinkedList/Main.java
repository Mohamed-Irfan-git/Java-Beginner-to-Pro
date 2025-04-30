package leetcode.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.firstInsert(10);
        list.firstInsert(20);
        list.firstInsert(30);
        list.firstInsert(40);
        list.firstInsert(50);
        list.lastInsert(20);
        list.insert(8,3);

        list.display();

    }
}
