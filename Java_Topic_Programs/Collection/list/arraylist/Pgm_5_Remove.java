package Collection.list.arraylist;

import java.util.ArrayList;

public class Pgm_5_Remove {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();
        System.out.println("Enter the data:");
        arrayList.add(1);
        arrayList.add(2.9);
        arrayList.add('y');
        arrayList.add("field");
        arrayList.add(false);
        System.out.println(arrayList);

        System.out.println("After removing:");
        arrayList.remove(1);//2.9
        System.out.println(arrayList);

    }
}
