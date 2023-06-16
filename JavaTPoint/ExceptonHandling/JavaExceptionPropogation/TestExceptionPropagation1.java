package ExceptonHandling.JavaExceptionPropogation;

public class TestExceptionPropagation1 {
    
    void m()
    {
        throw new java.io.IOException("device error");//checked exception
    }
}
