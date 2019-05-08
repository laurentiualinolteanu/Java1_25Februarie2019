public class Catalog<T>
{
    String nume;
    T nota;
    
    
    public void setNota(T nota)
    {
        this.nota=nota;
    }
    
    
    public T getNota()
    {
        return this.nota;
    }
    
    
    
    public static <U> void m1(U u)
    {
    
    }
}