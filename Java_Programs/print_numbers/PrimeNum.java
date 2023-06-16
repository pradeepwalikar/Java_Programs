package Java_Programs.print_numbers;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag=true;

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        for(int i=2;i<num;i++)
        {
            if (num%i == 0) {
                flag=false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Prime is: "+num);
        } else {
            System.out.println("Not a prime number: "+num);
        }
    }
}
