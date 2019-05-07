public class Animal implements java.io.Closeable{
    String nume;
    int varsta;
    
    public static long nrInstanteSterse = 0;
    
    public Animal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    
    @Override
    public void close() {
        System.out.println("Close la animalul " + this.nume);   
    }
    
    @Override
    public String toString() {
        return this.nume + " " + this.varsta;
    }
    
    @Override
    public int hashCode() {
        return this.varsta;
    }
    
    public boolean equals(Animal o) {
        if (o == null) {
           return false;
        }
        
        if (!(o instanceof Animal)) {
            return false;
        }
        
        return this.varsta == ((Animal)o).varsta;
    }
    
    @Override
    protected void finalize() throws Throwable {
        nrInstanteSterse++;
        System.out.println("finalize");
    }
    
    
    
    
    
    
    
    
    
}