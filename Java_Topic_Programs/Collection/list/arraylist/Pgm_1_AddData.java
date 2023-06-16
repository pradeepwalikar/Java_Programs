package Collection.list.arraylist;

import java.util.ArrayList;

public class Pgm_1_AddData {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();

        System.out.println("Add The Data");
        arrayList.add(10);
        arrayList.add(20.36);
        arrayList.add('c');
        arrayList.add("string");
        arrayList.add(true);
        System.out.println(arrayList);
    }
}
