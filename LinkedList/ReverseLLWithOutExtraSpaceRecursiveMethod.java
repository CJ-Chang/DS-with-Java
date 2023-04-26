package LinkedList;

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
}
