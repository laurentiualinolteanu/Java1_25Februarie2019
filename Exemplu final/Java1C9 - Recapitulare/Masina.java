public class Masina extends Vehicul {
    private String combustibil;
    
    public Masina(String marca, int pret, boolean disponibilitate, String combustibil) {
        super(marca, pret, disponibilitate);
        this.combustibil = combustibil;
    }
    
    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }
    
    public String getCombustibil() {
        return this.combustibil;
    }
    
    @Override
    public String toString(){
        return this.getMarca() + " " + this.getPret() + " " + this.getDisponibilitate() + " " + this.getCombustibil();
    }
}