package ExceptonHandling.ThrowsKeyword;

public class FinalizeExample {
    public static void main(String[] args) {
        
        FinalizeExample example = new FinalizeExample();

        System.out.println("Hash code is:"+example.hashCode());

        example=null;

        System.gc();

        System.out.println("End of the garbage collection");
    }

    protected void finalize()
    {
        System.out.println("Called the finalized method");
    }
}
