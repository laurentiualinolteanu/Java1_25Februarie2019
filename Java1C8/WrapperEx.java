public class WrapperEx
{
    public static void main(String[] args)
    {
        int a =2;
        Integer b=3;//new Integer(3)
        m1(a);
        m1(b);
        
    }
    
    
    public static void m1(int a)
    {
        System.out.println("int a="+ a);
        //afiseaza
        //int a=2
        //int a=3
    }
    //apoi fac asta:
    public static void m1(Integer a)
    {
        System.out.println("Integer a="+ a);
        //afiseaza
        //int a=2
        //Integer a=3
    }
    
    //daca o comentez pe prima imi apeleaza amandoua pe a 2-a cu integer
}