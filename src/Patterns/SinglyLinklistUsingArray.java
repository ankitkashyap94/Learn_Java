package Patterns;

public class SinglyLinklistUsingArray {

    private static ListNode head;

    public static class ListNode {

        private static int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void main(String[] args) {
        SinglyLinklistUsingArray sl = new SinglyLinklistUsingArray();
        sl.head = new ListNode(10);

        int[] arrData = {15, 45, 85, 21, 52, 33, 25, 62};
        String[] nodeName = {"first", "second", "third", "forth", "fifth", "sixth", "seventh", "eigth", "ninth", "tenth"};




    }


}
