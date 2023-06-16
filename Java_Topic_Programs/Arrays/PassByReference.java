package Arrays;

public class PassByReference {
    int a=10;

    static void disp(PassByReference byReference)
    {
        System.out.println(byReference.a);
    }

    public static void main(String[] args) {
        PassByReference passByReference = new PassByReference();
        System.out.println(passByReference.a);
        disp(passByReference);

    }
}
