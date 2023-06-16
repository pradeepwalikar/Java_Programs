package Collection.Set.HashSet;

import java.util.HashSet;

public class Pgm_1 {
    
    public static void main(String[] args) {
        
        HashSet hashSet = new HashSet<>();
        System.out.println("Add The data:");
        hashSet.add(10);
        hashSet.add(10.36);
        hashSet.add('g');
        hashSet.add("code");
        hashSet.add(false);
        hashSet.add(null);
        System.out.println(hashSet);
    }
}
