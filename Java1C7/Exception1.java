public class Exception1{
    public static void main (String[] args) {
               
        try {
          int[] a = {1, 2, 3, 4};
          //a[5] = 3;
          System.out.println("S-a terminat executia");  
          Animal animal = null;
          animal.varsta = 4;
        } catch(NullPointerException | IndexOutOfBoundsException e) {
          System.out.println("NullPointerException");
        } catch (Exception e) {
          System.out.println("Exception");
        } finally {
          System.out.println("FINALLY");
        }
        
        
    }
}