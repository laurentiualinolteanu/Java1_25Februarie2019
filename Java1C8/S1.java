import java.util.*;

public class S1 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int nr = Integer.parseInt(s.nextLine());
        
        Random r = new Random();
        for(int i = 0; i < nr; i++) {
            System.out.println(r.nextInt(1000));
        }
    }
}