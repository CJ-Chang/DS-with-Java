package LinkedList;

import java.util.*;

/*
 * Recursive Method
Time complexity - O(n)
Space complexity - O(1)  
 */

public class ReverseLLWithOutExtraSpaceRecursiveMethod {

    public Node reverseListRecursive(Node head) {
        //empty node || last node or only one node
        if(head == null || head.next == null) {
            return head;
        }
 
 
        Node newHead = reverseListRecursive(head.next);
       
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<Integer>();
        LL list = new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.head = list.reverseListRecursive(list.head);
        list.printList();
    }
}
