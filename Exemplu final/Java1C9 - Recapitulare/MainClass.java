import java.util.*;
public class MainClass{
   public static void main(String[] args){
       CentruDeInchiriere centruDeInchiriere = CentruDeInchiriere.getInstance();
       VehiculeThread vehiculeThread = new VehiculeThread();
       vehiculeThread.start();
       
       Scanner sc = new Scanner(System.in);
       
       while(true){
             String mesaj = sc.nextLine();
             String[] values = mesaj.split(" ");
             int pret = 0;
             
             switch(values[0]) {
                 case "am" : try {
                                 pret = Integer.valueOf(values[2]);
                             } catch(NumberFormatException nfe) {
                                 pret = 0;
                             }
                             Masina masina = new Masina(values[1], pret, values[3].equals("DA"), values[4]);
                             centruDeInchiriere.adaugaVehicul(masina);
                             break;
                 case "ab" : try {
                                 pret = Integer.valueOf(values[2]);
                             } catch(NumberFormatException nfe) {
                                 pret = 0;
                             }
                             Bicicleta bicicleta = new Bicicleta(values[1], pret, values[3].equals("DA"), values[4]);
                             centruDeInchiriere.adaugaVehicul(bicicleta);
                             break;
                 case "av" : centruDeInchiriere.afiseazaVehicule(); 
                             break;
                 case "avd": centruDeInchiriere.afiseazaVehiculeDisponibile(); 
                             break;
                 case "sterge" : centruDeInchiriere.stergeVehicul(Integer.valueOf(values[1]));
                                 break;
                 case "ir" : try { 
                                centruDeInchiriere.getPrimulVehiculDisponibilDupaMarca(values[1]);
                             } catch (MarcaIndisponibilaException mie) {
                                System.out.println(mie.getMessage());
                             }
                             break;
                 case "exit": System.exit(0);
                              break;
                 default: System.out.println("Comanda nu este cunoscuta.");
                          break;
             }
       }
   }  
}