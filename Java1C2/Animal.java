public class Animal {
    //atribute
    int varsta = 10;
    String nume;
    boolean areBlana;
    
    Animal() {
        
    }
    
    Animal(long t){
        System.out.println("Constructorul cu long");
    }
    
    Animal(int v) {
        System.out.println("Constructorul cu int");
        //varsta = v;
        //nume = "Bambi";
        //areBlana = true;
        
        //mananca();
    }
    
    //comportamente
    void mananca(){
        nume = "peste";
        System.out.println("Animalul mananca");
    }
    
    int getVarsta() {
        //mananca();
        /*if (10 == 20) {
            return 10;
        }*/
        return 20;
    }
    
    
    
    
    
    
    
    
    
    
}