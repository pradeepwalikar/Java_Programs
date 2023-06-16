package Collection.list.arraylist;

import java.util.ArrayList;

public class Pgm_2_AddData_UpOnIndex {
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList<>();

        System.out.println("Add Data:");

        arrayList.add(1);
        arrayList.add(2.36);
        arrayList.add('r');
        arrayList.add("dd");

        System.out.println(arrayList);

        System.out.println("Add Data Up On Index:");

        arrayList.add(0, 56);

        System.out.println(arrayList);

    }   
}
