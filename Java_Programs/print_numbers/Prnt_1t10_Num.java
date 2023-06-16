package Java_Programs.print_numbers;

import java.util.Scanner;

public class Prnt_1t10_Num
{
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter the First Number");
       int first_no = scanner.nextInt();

       System.out.println("Enter the Second number");
       int second_no = scanner.nextInt();

       System.out.println("Integer Numbers are: ");
       while(first_no<=second_no)
       {
            System.out.println(first_no);
            first_no++;
       }
    }
}