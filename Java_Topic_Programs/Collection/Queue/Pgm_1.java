package Collection.Queue;

import java.util.PriorityQueue;

public class Pgm_1 {
    
    public static void main(String[] args) {
        
        PriorityQueue priorityQueue = new PriorityQueue<>();
        System.out.println("Add the data");
        priorityQueue.add(10);
        priorityQueue.add(56);
        priorityQueue.add(589);
        priorityQueue.add(789);
        System.out.println(priorityQueue);
    }
}
