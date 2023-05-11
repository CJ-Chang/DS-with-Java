package LinkedList;

/*
 * Iterative Method
Time complexity - O(n)
Space complexity - O(1)

 */
public class ReverseLLWithOutExtraSpaceIterativeMethod {
    
    public void reverseListIterate() {
        if(head == null || head.next == null) {
            return;
        }
    
    
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

}


