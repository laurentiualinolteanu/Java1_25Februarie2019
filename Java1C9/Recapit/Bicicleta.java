public class Bicicleta extends Vehicul {
    private String echipament;
    
    Bicicleta(String marca, int pret, boolean disponibilitate,String echipament){
        this.marca = marca;
        this.pret = pret;
        this.disponibilitate = disponibilitate;
        this.echipament = echipament;
    }
    
    public void setEchipament (String Echipament) {
        this.echipament = echipament;
    }
    
    public String getEchipament () {
        return this.echipament;
    }
    @Override
    public String toString(){
        return marca + " " + pret + " " + disponibilitate + " " + echipament;
    }


}