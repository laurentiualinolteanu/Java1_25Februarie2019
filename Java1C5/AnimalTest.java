public class AnimalTest{
    public static void main (String[] args) {
        Animal[] animale = new Animal[2];
        animale[0] = new Iepure();
        
        animale[1] = new Urs();
        
        for (Animal a : animale) {
            a.m1();
        }
        
        //nu se pot crea instante de clase abstracte
        //Animal a = new Animal();
    }
}