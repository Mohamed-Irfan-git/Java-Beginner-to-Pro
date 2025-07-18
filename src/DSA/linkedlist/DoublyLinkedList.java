package DSA.linkedlist;
public class DoublyLinkedList {
    private Node head;



    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }

        head = node;

    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            head.next=null;
            head.prev=null;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next=null;
    }
    public void insert(int val,int after){
        Node p = find(val);
        if(p == null){
            System.out.println("Not found");
        }
        Node node = new Node(after);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;

        }

    }

    private Node find(int val){
        Node node = head;
        while (node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
     private Node get(int index){
        Node node = head;
       for(int i=0;i<index;i++){
           node = node.next;
       }
       return node;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null) {
            System.out.print(temp.val + " ->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print Previous");
        while(last != null) {
            System.out.print(last.val + " ->");
            last = last.prev;
        }
        System.out.println("START");
    }
}
