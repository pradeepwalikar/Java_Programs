package Collection.list.arraylist;

import java.util.ArrayList;

public class Pgm_6_RemoveAll {
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList<>();
        System.out.println("First Index:");
        arrayList.add(1);
        arrayList.add(2.78);
        arrayList.add('p');
        arrayList.add("super");
        arrayList.add(false);
        System.out.println(arrayList);

        ArrayList arrayList2 = new ArrayList<>();
        System.out.println("Second index:");
        arrayList2.add(8);
        arrayList2.add(6.89);
        arrayList2.add('t');
        arrayList2.add("plus");
        System.out.println(arrayList2);

        System.out.println("Addind both the arraylist:");
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);

        System.out.println("After using Remove All()");
        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);
    }
}
