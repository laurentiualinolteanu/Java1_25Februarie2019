public class Exception2{
    public static void main (String[] args) throws MyException{
        
        try (Animal a = new Animal("Rex", 1);
            Animal b = new Animal("Laica", 2)) {            
            a.varsta = 3;
            b.varsta = 4;
        } catch (Exception e) {
            System.out.println("Exceptie");
        }
        
        //try {
            m1();
        //} catch (MyException e) {
            
        //}
    }
    
    public static void m1() throws MyException{
     int a = 1;
     int b = 2;
     //try {
         if (a != b) {
             throw new MyException();
         }
     //} catch (MyException e) {
     //    System.out.println("Numere diferite");
     //}
    }
    
    public void m2() {
        if (1 == 1) {
            throw new MyRuntimeException();
        }
    }
    
    
}