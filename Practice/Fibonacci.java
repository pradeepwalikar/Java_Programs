import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the f1 value:");
        int f1 = scanner.nextInt();

        System.out.println("Enter the f2 value:");
        int f2 = scanner.nextInt();

        int k = 6;

        System.out.println(f1+"      "+f2);
        for(int i=0; i<4;i++)
        {
            for(int j=0; j<7; j++)
            {
                if(j==i || j==(k-i))
                {
                    int f3 = f1+f2;
                    System.out.print(f3);
                    f1=f2;
                    f2=f3;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}