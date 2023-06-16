package Java_Programs.print_numbers;

import java.util.Scanner;

public class Prnt_Desc_Even_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First number");
        int first_no = scanner.nextInt();

        System.out.println("Enter the Second number");
        int second_no = scanner.nextInt();

        System.out.println("Even numbers Are:");

        while (first_no >= second_no) {
            if (first_no%2 == 0) {
                System.out.println(first_no);
                
            }
            first_no--;
            
        }
    }
}
