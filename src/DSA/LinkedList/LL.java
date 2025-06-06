package DSA.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    public LL() {
        this.size = 0;
    }

    public void lastInsertion(int value){

        if(tail == null){
            insertionFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertionFirst(int value){
        Node node = new Node(value);
        node.next =head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;

    }

    public void insert(int value , int position){

        if(head == null){
            lastInsertion(value);
            return;
        }

        if(size == position){
            lastInsertion(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i < position; i++){
            temp = temp.next;

        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst(){
        int val= head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){

        if(size<=1){
            return deleteFirst();
        }
        Node secondValue = get(size - 2);
        int val= tail.value;
        tail = secondValue;
        tail.next = null;
        size--;
        return val;


    }

    public Node get(int val){
        Node node = head;
        for(int i = 1; i < val; i++){
            node = node.next;

        }
        return node;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val= prev.next.value;
        prev.next = prev.next.next;
        size--;

        return val;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;

        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}
