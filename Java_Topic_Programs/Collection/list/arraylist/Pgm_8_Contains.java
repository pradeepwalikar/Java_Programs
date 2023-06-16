package Collection.list.arraylist;

import java.util.ArrayList;

public class Pgm_8_Contains {
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList<>();
        System.out.println("First Array");
        arrayList.add(1);
        arrayList.add(2.78);
        arrayList.add('p');
        arrayList.add("super");
        arrayList.add(false);
        System.out.println(arrayList);
        System.out.println(arrayList.contains('p'));
    }
}
