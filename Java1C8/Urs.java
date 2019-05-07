public class Urs <T> {
    T hrana;
    
    public T getHrana() {
        return hrana;
    }
    
    public void getTip() {
        if (getHrana() instanceof Carne) {
            System.out.println("Carnivor");
        } else if (getHrana() instanceof Iarba) {
            System.out.println("Ierbivor");
        }
    }
    
    public static <R> void accept(R hrana) {
        System.out.println(hrana.getClass());
        // return hrana;
    }
        
}