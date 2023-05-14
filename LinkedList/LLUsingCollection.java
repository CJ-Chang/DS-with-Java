package LinkedList;

// LinkedList class Implementation (Collection Framework)

import java.util.*;

class LLUsingCollection {
   public static void main(String args[]) {
       LinkedList<String> list = new LinkedList<String>();
       list.add("is");
       list.add("a");
       list.addLast("list");
       list.addFirst("this");
       list.add(3, "linked"); // by default new node gets added at the end of the list
       System.out.println(list);


       System.out.println(list.get(0));
       System.out.println(list.size());   
       list.remove(3);
       list.removeFirst();
       list.removeLast();
      
       System.out.println(list);
   }
}
