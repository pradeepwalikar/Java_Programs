package Java_Programs.print_numbers;

import java.util.Scanner;

public class Fizz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        if (num%3 == 0 && num%5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (num%3 == 0) {
            System.out.println("Fizz Fizz");
        } else if (num%5 == 0) {
            System.out.println("Buzz Buzz");
        } else {
            System.out.println("Invalid number");
        }
    }
}
