package leetcode.linked;

public class RemovedDuplicates {
    private Node head;

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
    public void removeDuplicates(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }
        }

    }
}
