package Java_Programs.print_character;

public class Print_ZtoA {
    public static void main(String[] args) {
        char ch = 'Z';
        for(int i=1;i<=26;i++)
        {
            System.out.print(ch+" ");
            ch--;
        }
    }
}
