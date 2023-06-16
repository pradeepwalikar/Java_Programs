package Collection.list.vector;

import java.util.Vector;

public class Pgm_1_Capacity {
    public static void main(String[] args) {
        
        Vector vector = new Vector<>(3);

        System.out.println("Before capacity:" + vector.capacity());

        vector.add(10);
        vector.add(56.369);
        vector.add('p');
        vector.add("controller");
        vector.add(false);
        System.out.println(vector);
        System.out.println("capacity:" + vector.capacity());
        System.out.println(vector.size());
    }
}
