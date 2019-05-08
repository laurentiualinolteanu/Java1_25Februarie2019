import java.util.*;
public class Operatii{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     while(true){
     String a= sc.nextLine();
     if (a.equals("exit")){
         System.exit(0);
     } 
     
     CentruDeInchiriere b= CentruDeInchiriere.getInstance();
     
     if (a.startsWith("am")) {
         String[] elem = a.split(" ");
         String marca = elem[1];
         int pret = Integer.valueOf(elem[2]);
         boolean disp = elem[3].equals("DA");
         String combustibil = elem[4];
         Masina m = new Masina(marca, pret, disp, combustibil);
         b.adaugaVehicul(m);
     }
     
     
     if (a.equals("av")){
        b.afiseazaVehicule();         
    }  
     
     if (a.startsWith("ab")) {
         String[] elem = a.split(" ");
         String marca = elem[1];
         int pret = Integer.valueOf(elem[2]);
         boolean disp = elem[3].equals("DA");
         String echipament = elem[4];
         Bicicleta m = new Bicicleta(marca, pret, disp, echipament);
         b.adaugaVehicul(m);
     }
    
     if (a.equals("avd")){
        b.afiseazaVehiculeDisponibile();         
    }  
     
     
    }
   } 
   
   
   
   
   
   
   
}