package Java_Programs.print_numbers;

import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {
        int fact=1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }

        System.out.println("Factorial of given number is: "+fact);

    }
}
