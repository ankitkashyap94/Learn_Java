package Patterns;

import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        SinglyLinklistUsingArray sl = new SinglyLinklistUsingArray();
        sl.head = new ListNode(i);

    }


}
