package Collection.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class Pgm_1 {
    
    public static void main(String[] args) {
        
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        System.out.println("Add The data:");
        linkedHashSet.add(10);
        linkedHashSet.add(45.36);
        linkedHashSet.add('p');
        linkedHashSet.add("pgm");
        linkedHashSet.add(true);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);
    }
}
