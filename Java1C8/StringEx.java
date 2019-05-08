        public class StringEx
        {
        public static void main(String[] args)
        {
            String nume1="Ionel";
            String nume2="Georgel";
            
            System.out.println(nume1==nume2);//false
            
            String nume3="Ionel";
            
            System.out.println(nume1==nume3);//true-> la gasit pe Ionel in piscina
            
            String nume4=new String("Ionel");//creeaza o zona noua de memorie care nu e in String Pool
            System.out.println(nume1==nume4);//false
            
            String nume5=new String("Ionel");//creeaza o zona noua de memorie care nu e in String Pool
            System.out.println(nume4==nume5);//false
            
            
            String masina="masina";
            System.out.println(masina.indexOf("a"));//1
            
             System.out.println(masina.substring(2));//sina
             System.out.println(masina.substring(2,4));//si // de la 2 la 4 exclusiv// adica poz 2 si 3
             System.out.println(masina.length());//6
             System.out.println(masina.length()-1);//5
             System.out.println("masina".contains("asi"));//true
              
             
        
        }
}