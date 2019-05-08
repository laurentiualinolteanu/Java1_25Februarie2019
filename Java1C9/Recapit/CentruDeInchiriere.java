

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
    
    public void adaugaVehicul (Vehicul v){
        vehicule.add(v);
    }
    public void afiseazaVehicule(){
        for (int i=0;i<vehicule.size();i++){
            System.out.println(vehicule.get(i));
        }
    }
    public void afiseazaVehiculeDisponibile(){
        for (int i=0;i<vehicule.size();i++){
            if (vehicule.get(i).disponibilitate==true) {
                System.out.println(vehicule.get(i));
            }
        }
    } 
    
    public void stergeVehicul(int i){
       vehicule.remove(i);
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}