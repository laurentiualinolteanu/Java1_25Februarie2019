public class Ex2{
    public static void main (String[] args) {
        Animal a = new Animal("Rex", 3);
        Animal b = new Animal("Rex", 3);
        System.out.println(a);
        System.out.println(a.toString());
        System.out.println(a.hashCode());
        
        System.out.println(a.equals(b));
        System.out.println(a == b);
        
        for (int i = 0; i < 100000; i++) {
            new Animal("Laica", 4);
        }
        System.out.println("================");
        System.out.println(Animal.nrInstanteSterse);
        
    }
}