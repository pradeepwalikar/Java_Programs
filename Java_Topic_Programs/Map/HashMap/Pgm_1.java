package Map.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Pgm_1 {

    public static void main(String[] args) {
        
        HashMap<Integer ,String> hashMap = new HashMap<>();
        hashMap.put(1, "hi");
        hashMap.put(2, "hello");
        hashMap.put(3, "code");
        System.out.println(hashMap);

        for (Entry a : hashMap.entrySet()) {
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}
