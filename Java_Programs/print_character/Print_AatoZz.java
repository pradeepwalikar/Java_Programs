package Java_Programs.print_character;

public class Print_AatoZz {
    public static void main(String[] args) {
        char ch1='A';
        char ch2='a';

        for(int i=1; i<=26; i++)
        {
            System.out.print(ch1+""+ch2+" ");
            ch1++;
            ch2++;
        }
    }
}
