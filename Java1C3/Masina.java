public class Masina{
   String culoare = "albastru";
   String marca;
   int an;
   
   {
       System.out.println("Inainte de bloc init " + culoare);
       culoare = "mov";
       System.out.println("Dupa blocul init " + culoare);
       franeaza();
   }
   
   Masina(String c, String m, int a) {
       System.out.println("Culoare la intrare in contructor: " + culoare);
       culoare = c;
       System.out.println("Culoare dupa initializare in constructor: " + culoare);
       marca = m;
       an = a;
   }
   
   public void franeaza() {
       System.out.println("Masina franeaza!");
   }
   
   public void franeaza(String marca) {
       System.out.println(marca + " franeaza");
   }
   
   public void franeaza(int an) {
       System.out.println(an);
   }
   
   /*public int franeaza(int an) {
       return an;
   }*/
   
   
   
   
   
   
   {
       System.out.println("Inainte de bloc init " + culoare);
       culoare = "portocaliu";
       System.out.println("Dupa blocul init " + culoare);
   }
    
   public int calculeazaVarsta() {
       int varsta = 2019 - an;
       return varsta;
   }
   
   
   
   
   
   
   
   
   
       
    
}