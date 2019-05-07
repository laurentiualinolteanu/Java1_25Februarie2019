import java.util.Scanner;

public class ClasaScanner {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String br = s.nextLine();
        System.out.println(br.toUpperCase());
        
        while (!br.equals("STOP")) {
            br = s.nextLine();
            StringBuilder sb = new StringBuilder(br);
            System.out.println(sb.reverse());
        }
        br = "";
        while (true) {
            String s1 = s.nextLine();
            if (s1.equals("STOP")) {
                break;
            }
            int nr1 = Integer.parseInt(s1);
            int nr2 = Integer.parseInt(s.nextLine().trim());
            System.out.println(nr1 + nr2);
        }
    }
}