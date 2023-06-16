package Collection.list.arraylist;

import java.util.ArrayList;

public class Pgm_3_AddAll_UpOnIndex {
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList<>();
        System.out.println("Add First Index Data of arrayList");
        arrayList.add(5);
        arrayList.add(3.5);
        arrayList.add('r');
        arrayList.add("VIKRAM");
        arrayList.add(true);
        System.out.println(arrayList);

        ArrayList arrayList2 = new ArrayList<>();
        System.out.println("Add Second Index Data of arrayList");
        arrayList2.add(8);
        arrayList2.add(9.25);
        arrayList2.add("u");
        arrayList2.add("wali");
        arrayList2.add(false);
        System.out.println(arrayList2);

        System.out.println("Add All Up On Index Value's:");
        arrayList.addAll(2, arrayList2);
        System.out.println(arrayList);
    }
}
