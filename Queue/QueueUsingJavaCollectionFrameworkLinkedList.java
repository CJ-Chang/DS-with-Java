package DS-with-Java.Queue;

//queue using Java Collection Framework
import java.util.*;

public class QueueUsingJavaCollectionFrameworkLinkedList {
    public static void main(String args[]) {
        // Queue<Integer> q = new LinkedList();

        // here we're creating a Queue to hold integer values. So used: Queue<Integer>
        // Queue is an Interface in Java, but not a class.
        // Object can be of Class only but not of Interface.
        // Queus Interface is implemented by 2 classes as follows-
        // 1. ArrayDeque, 2. LinkedList

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
