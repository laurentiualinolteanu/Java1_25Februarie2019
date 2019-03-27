public class Bicicleta extends Vehicul{
    int nrPedale;
    String culoare;
    
    public Bicicleta() {
        super("rosu");
        System.out.println("Constructor Bicicleta");
        
        this.nrPedale = 2;
        this.culoare = "galben";
        super.culoare = "rosu";
    }
    
    public Bicicleta(int nrPedale) {
        this();
        this.nrPedale = nrPedale;
    }
}