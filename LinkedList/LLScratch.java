package LinkedList;

// Scratch Implementation (Important for BEGINNERS)

public class LLScratch {
    


    Node head;
    private int size;
 
 
    LLScratch () {
        // size = 0;
        this.size = 0;
    }
 
 
    public class Node {
        String data;
        Node next;
 
 
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
 
    // add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
 
    // add - last
    public void addLast(String data) {
        Node newNode = new Node(data);


       if(head == null) {
           head = newNode;
           return;
       }


       Node lastNode = head;
       while(lastNode.next != null) {
           lastNode = lastNode.next;
       }


       lastNode.next = newNode;
   }

   // print
   public void printList() {
    if(head == null) {
        System.out.println("list is empty!");
        return;
    }

       Node currNode = head;


       while(currNode != null) {
           System.out.print(currNode.data + " -> ");
           currNode = currNode.next;
       }


       System.out.println("null");
    }

    // delete - first
    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
 
 
        // head = this.head.next;
        head = head.next;
        size--;
    }
 
    // delete - last
    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }
 
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
 
 
        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }
 
 
        secondLastNode.next = null;
    }
 
 
    public int getSize() {
        return size;
    }
  
 
 
 
 
    public static void main(String args[]) {
        LLScratch list = new LLScratch();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
 
 
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize()); 
 
 
        list.removeFirst();

        list.printList();


       list.removeLast();
       list.printList();
   }
}
