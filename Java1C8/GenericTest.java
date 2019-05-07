public class GenericTest {
    public static void main (String[] args) {
        Urs<Carne> urs = new Urs<Carne>();
        
        urs.hrana = new Carne();
        //urs.hrana = new Iarba();
        System.out.println(urs.hrana.getClass());
        urs.getTip();
        
        Urs.accept(new Iarba());
        Urs.accept(new Carne());
        
        A<Integer> a = new A<>();
        A<? extends Number> b = new A<Integer>();
        
        C<? extends Number> c = new C<Integer>();
        c = new C<Double>();
    }
}