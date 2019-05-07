import java.util.Scanner;

public class S2 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        int nr1 = Integer.parseInt(s.nextLine());
        int nr2 = Integer.parseInt(s.nextLine());
        
        System.out.println(Math.pow(nr1, nr2));
    }
}   