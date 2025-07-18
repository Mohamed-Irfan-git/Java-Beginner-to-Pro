package DSA.linkedlist;
public class Ll {
    private Node head;
    private Node tail;
    private int size;


    private static class Node {
        private final int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }


    }


    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;

        }
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val,int index) {
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public void deleteFirst(){
        head = head.next;
        size--;
    }
    public void deleteLast(){
       if(size<=1){
           deleteFirst();
           return;
       }
       Node secondLast = get(size-2);
       int value = tail.val;
       tail= secondLast;
       tail.next = null;
       size--;

    }
    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node newNode = new Node(val);
            newNode.next = node;
            return newNode;
        }
        node.next= insertRec(val,index-1,node.next);
        return node;

    }
    public void removeDuplicates() {
        Node temp = head;
        if (temp == null) {
            return;
        }
        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
                size--;
            }
            if(temp.next == null){
                break;
            }
            if(temp.val!=temp.next.val){
                temp = temp.next;
            }

        }

    }
    public Ll merge(Ll first,Ll second){
        Ll ans = new Ll();
        Node f = first.head;
        Node s = second.head;

        while (f.next != null && s.next != null) {
            if(f.val < s.val){
                ans.insertLast(f.val);
                f = f.next;
            }
            else {
                ans.insertLast(s.val);
                s = s.next;
            }


        }
        while (f.next != null) {
            ans.insertLast(f.val);
            f = f.next;
        }
        while (s.next != null) {
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;
    }

    public void delete(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size-1){
            deleteLast();
        }
        Node node = get(index-1);
        node.next = node.next.next;
        size--;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }



    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public boolean hasCycle(){
        Node fast = head;
        Node slow = head;


        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public Node cycleNode(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){

                Node entry = head;
                while(entry != slow){
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }

        return null;
    }


    public boolean happyNumber(int n){
        Node fast = new Node(getSquareOfSum(n));
        Node slow = new Node(n);

        while(fast.val!=1 && fast.val!=slow.val){
            slow = new Node(getSquareOfSum(slow.val));
            fast = new Node(getSquareOfSum(getSquareOfSum(fast.val)));
        }
        return fast.val==1;

    }
    public int getSquareOfSum(int n){
        int result = 0;
        while(n>0){
            int rem = n%10;
            result += rem*rem;
            n = n/10;
        }
        return result;
    }
}
