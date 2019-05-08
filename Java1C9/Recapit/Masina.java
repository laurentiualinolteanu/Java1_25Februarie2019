public class Masina extends Vehicul{
    private String combustibil;
    public Masina(String marca, int pret, boolean disponibilitate,String combustibil) {
        this.marca = marca;
        this.pret = pret;
        this.disponibilitate = disponibilitate;
        this.combustibil = combustibil;
    }
    
    
    
    public void setCombustibil(String combustibil){
        this.combustibil=combustibil;
    }
    
    public String getCombustibil(){
        return this.combustibil;
    }
    
    @Override
    public String toString(){
        return marca + " " + pret + " " + disponibilitate + " " + combustibil;
    }
    
    
    
}
    
    

