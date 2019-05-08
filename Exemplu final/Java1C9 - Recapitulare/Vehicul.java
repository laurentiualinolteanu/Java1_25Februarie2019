public class Vehicul {
   private String marca;
   private int pret;
   private boolean disponibilitate;
   
   public Vehicul(String marca, int pret, boolean disponibilitate) {
       this.marca = marca;
       this.pret = pret;
       this.disponibilitate = disponibilitate;
   }
   
   public void setMarca(String marca) {
       this.marca = marca;
   }
   
   public String getMarca() {
       return this.marca;
   }
   
   public void setPret(int pret) {
       this.pret = pret;
   }
   
   public int getPret() {
       return this.pret;
   }
   
   public void setDisponibilitate(boolean disponibilitate) {
       this.disponibilitate = disponibilitate;
   }
   
   public boolean getDisponibilitate() {
       return this.disponibilitate;
   }
}