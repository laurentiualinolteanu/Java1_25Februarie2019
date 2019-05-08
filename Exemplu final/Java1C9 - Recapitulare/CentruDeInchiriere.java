import java.util.*;

public class CentruDeInchiriere {
    private static CentruDeInchiriere myInstance = null;
    private List<Vehicul> vehicule = new ArrayList<>();
    
    private CentruDeInchiriere(){
        
    }
    
    public static CentruDeInchiriere getInstance(){
        if(myInstance == null){
            myInstance = new CentruDeInchiriere();
        }
        return myInstance;
        
    }
    
    public int getNrVehicule() {
        return vehicule.size();
    }
    
    public void adaugaVehicul (Vehicul v){
        vehicule.add(v);
    }
    
    public void afiseazaVehicule(){
        vehicule.forEach(System.out::println);
    }
    public void afiseazaVehiculeDisponibile(){
        for (int i = 0; i < vehicule.size(); i++){
            if (vehicule.get(i).getDisponibilitate() == true) {
                System.out.println(vehicule.get(i));
            }
        }
    } 
    
    public void stergeVehicul(int i){
        try {
            vehicule.remove(i);
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("Indexul este mai mare decat numarul de autovehicule din baza de date");
        }
    } 
    
    public void getPrimulVehiculDisponibilDupaMarca(String marca) throws MarcaIndisponibilaException{
        boolean existVehicul = false;
        for(Vehicul vehicul : vehicule) {
            if (vehicul.getMarca().equals(marca) && vehicul.getDisponibilitate() == true) {
                System.out.println(vehicul);
                existVehicul = true;
                break;
            }
        }
        
        if (!existVehicul) {
            throw new MarcaIndisponibilaException();
        }
    }
}