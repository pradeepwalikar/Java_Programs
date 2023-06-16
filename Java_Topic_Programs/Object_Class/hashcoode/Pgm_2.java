package Java_Topic_Programs.Object_Class.hashcoode;

public class Pgm_2 {
    public static void main(String[] args) {
        Pgm_2 pgm_2 = new Pgm_2();
        Pgm_2 pgm_22 = pgm_2;

        System.out.println(pgm_2);
        System.out.println(pgm_22);

        System.out.println(pgm_2.hashCode());
        System.out.println(pgm_22.hashCode());
    }
}
