package Collection.list.arraylist;

import java.util.ArrayList;

public class Pgm_2_AddAll {
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList<>();
        System.out.println("Add First Index Data :");
        arrayList.add(1);
        arrayList.add(2.3);
        arrayList.add('r');
        arrayList.add("RRR");
        arrayList.add(true);
        System.out.println(arrayList );

        ArrayList arrayList2 = new ArrayList<>();
        System.out.println("Add Second Index Data");
        arrayList2.add(2);
        arrayList2.add(5.98);
        arrayList2.add('s');
        arrayList2.add("KGF");
        arrayList2.add(false);
        System.out.println(arrayList2);

        System.out.println("Add All:");
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);
    }
}
