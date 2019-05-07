
import java.io.Console;

public class ClasaSystem {
    public static void main (String[] args) {
        System.err.println("Eroare");
        System.out.println(System.currentTimeMillis());
        //System.exit(0);
        System.out.println("Dupa System.exit(0)");
        
        int[] a = new int[5];
        int[] b = new int[6];
        
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        
        System.arraycopy(a, 0, b, 1, 5);
        for (int nr : b) {
            System.out.println(nr);
        }
        
        // String input = System.console().readLine();
        // System.out.println(input);
        
    }
}