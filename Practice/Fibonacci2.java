import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lines:");
        int lines = scanner.nextInt();

        System.out.println("Enter first number in the seriers");
        int f1 = scanner.nextInt();

        System.out.println("Enter second number in the series");
        int f2 = scanner.nextInt();

        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=lines;j++)
            {
                if(i==j)
                {
                    System.out.println(f1);
                }
                else if(j>i && (j==8-i))
                {
                    System.out.print(f2);
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
    }
}
