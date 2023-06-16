package Collection.Queue;

import java.util.LinkedList;

public class Pgm_1_LinkedList {
    
    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList<>();
        System.out.println("Add The data");
        linkedList.add(10);
        linkedList.add(20.36);
        linkedList.add('y');
        linkedList.add("hello");
        linkedList.add(null);
        linkedList.add(false);
        System.out.println(linkedList);

        System.out.println(linkedList.get(1));

        System.out.println(linkedList.poll());
        System.out.println(linkedList);

        System.out.println(linkedList.peek());
        System.out.println(linkedList);
    }
}
