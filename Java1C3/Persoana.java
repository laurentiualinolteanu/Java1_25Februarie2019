public class Persoana {
    String nume;
    int varsta;
    
    public Persoana() {
        this("Vasile", 20);
    }
    
    public Persoana(String nume) {
        this();
        this.nume = "Ion";
        //this(nume, 20);
    }
    
    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
}