package Java_Programs.print_character;

public class Print_AtoZ_and_ZtoA {
    public static void main(String[] args) {
        char ch1='A';
        char ch2='Z';
        
        for(int i=1; i<=26; i++)
        {
            System.out.println(ch1+" "+ch2);
            ch1++;
            ch2--;
        }
    }
}
