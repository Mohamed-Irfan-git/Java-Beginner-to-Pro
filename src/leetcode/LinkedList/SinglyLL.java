package leetcode.LinkedList;

public class SinglyLL {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLL() {
        this.size = 0;
    }

    public void firstInsert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = head;
        }
        else{
            node.next = head;
            head = node;
        }

        size++;
    }
    public void lastInsert(int val){
        Node node = new Node(val);
        if(head == null){
           firstInsert(val);
        }
        else{
            tail.next = node;
            tail = node;
        }
        size++;

    }

    public void insert(int val , int index){
        if(head == null){
            firstInsert(val);
        }
        if(index == size){
            lastInsert(val);
        }
        Node node = new Node(val);
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;

        }
        node.next = temp.next;
        temp.next = node;

        size++;
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}


