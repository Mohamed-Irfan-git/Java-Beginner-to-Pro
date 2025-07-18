package DSA.linkedlist;

public class Main {
    public static void main(String[] args) {
        Ll  ll = new Ll();
        Ll ll2 = new Ll();
        ll2.insertLast(1);
        ll2.insertLast(2);
        ll2.insertLast(3);
        ll2.insertLast(4);


        ll.insertFirst(40);
        ll.insertFirst(40);
        ll.insertFirst(30);
        ll.insertFirst(30);
        ll.insertFirst(20);
        ll.insertFirst(20);
        ll.insertFirst(20);
        ll.insertFirst(20);
        ll.insertFirst(20);
        ll.insertFirst(15);
//        ll.insert(100,1);
//        ll.insertRec(25,3);
//        ll.removeDuplicates();

        Ll ans = ll.merge(ll,ll2);
        ans.removeDuplicates();

        ans.display();

//        DoublyLinkedList dll = new DoublyLinkedList();
//        dll.insertFirst(10);
//        dll.insertFirst(2);
//        dll.insertFirst(30);
//        dll.insertLast(20);
//        dll.insert(2,12);
//
//        dll.display();
    }
}
