public class Biblioteca {
    final int nrCarti = 1;
    static final String localitate = "a";
    
    {
        System.out.println("Bloc de initializare");
        //nrCarti = 4;
        //localitate = "Buc";
    }
    
    static {
        System.out.println("Bloc de initializare static");
        //localitate = "Buc";
    }
    
    public Biblioteca(int nrCarti){        
        System.out.println("Constructor");
        //this.nrCarti = nrCarti;
        //localitate = "Buc";
    }
}