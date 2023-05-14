package LinkedList.Questions;

/*
 * Detecting Loop in a Linked List.
 * 
Time complexity - O(n)
Space complexity - O(1)  
 */

public class DetectingLoopInLL {
    
}

public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
   
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
       
        if(fast == slow) {
            return true;
        }
    }
   
    return false;
 }
 