public class TestAnimal {
    public static void main (String[] args) {
        Animal animal = new Animal();
        
        Animal animal2;
        animal2 = new Animal();
        
        int v = animal.varsta;
        System.out.println(v);
        
        animal.varsta = 5;
        System.out.println(animal.varsta);
        
        
        animal.mananca();
        int varsta = animal.getVarsta();
        System.out.println(varsta);
        System.out.println(animal.getVarsta());
        
        Animal animal3 = animal2;
        animal2.varsta = 100;
        System.out.println(animal3.varsta);
        
        
        
        
        animal2 = new Animal();
        animal2.varsta = 200;
        System.out.println(animal3.varsta);
        
        animal3 = null;
        
        
        int i = 5;
        Animal animal4 = new Animal(i);        
        
        long j = 6;
        Animal animal5 = new Animal(j);
        
        Animal animal6 = new Animal(6);
        
        
        
        
        
    }
}