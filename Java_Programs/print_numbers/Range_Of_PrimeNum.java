package Java_Programs.print_numbers;

import java.util.Scanner;

public class Range_Of_PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First number");
        int firstNo = scanner.nextInt();

        System.out.println("Enter the Second number");
        int secondNo = scanner.nextInt();

        for(int i=2; i<=firstNo; i++)
        {
            secondNo=i;
            boolean flag = true;

            for(int j=2; j<secondNo; j++)
            {
                if(secondNo%j == 0)
                {
                    flag=false;
                    break;
                }
            }

            if (flag=true) {
                System.out.println("Prime no's"+secondNo);
            }
        }
    }
}
