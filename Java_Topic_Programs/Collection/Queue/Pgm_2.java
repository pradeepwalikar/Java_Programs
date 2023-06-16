package Collection.Queue;

import java.util.PriorityQueue;

public class Pgm_2 {

    public static void main(String[] args) {
        
        PriorityQueue priorityQueue = new PriorityQueue<>();
        System.out.println("Add the data");
        priorityQueue.add(45);
        priorityQueue.add(55);
        priorityQueue.add(89);
        priorityQueue.add(45);
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
    }
}
