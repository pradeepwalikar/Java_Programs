package Java_Programs.print_numbers;

import java.util.Scanner;

public class Prnt_Desc_Odd_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int first_no = scanner.nextInt();

        System.out.println("Enter the Second number");
        int second_no = scanner.nextInt();

        System.out.println("Odd number Are:");

        while (first_no >= second_no) {
            if (first_no%2 == 1) {
                System.out.println(first_no);
            }
            first_no--;
        }
    }
}
