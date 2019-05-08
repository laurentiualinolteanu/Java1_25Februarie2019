public class Bicicleta extends Vehicul {
    private String echipament;
    
    public Bicicleta(String marca, int pret, boolean disponibilitate, String echipament) {
        super(marca, pret, disponibilitate);
        this.echipament = echipament;
    }
    
    public void setEchipament(String echipament) {
        this.echipament = echipament;
    }
    
    public String getEchipament() {
        return this.echipament;
    }
    
    
    @Override
    public String toString(){
        return this.getMarca() + " " + this.getPret() + " " + this.getDisponibilitate() + " " + this.getEchipament();
    }
}