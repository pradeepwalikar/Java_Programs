package Java_Programs.print_numbers;

public class Fibonacci {
    public static void main(String[] args) {
        int f1=0;
        int f2=1;
        int f3;

        System.out.println(f1+"     "+f2);
        for(int i=1; i<=10; i++)
        {
            f3=f1+f2;
            f1=f2;
            f2=f3;

            System.out.println(f3+" ");
        }
    }
}
