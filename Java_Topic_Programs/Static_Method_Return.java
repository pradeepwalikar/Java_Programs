package Java_Topic_Programs;

public class Static_Method_Return {
    static int add(){
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        //add();
        System.out.println(add());
    }
}
