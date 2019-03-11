public class OperatorTest {
    public static void main (String[] args) {
        int a = 5;
        int b = a + 7;
        
        
        byte c = 127;
        c++;
        
        System.out.println(c);
        
        
        int d = a / 3;
        System.out.println(d);
        
        int e = a % 3;
        System.out.println(e);
        
        int f = 6;
        f += 3; // f = 9
        
        boolean g = a >= 4;
        boolean h = b <= 3 && a > 5;
        
        boolean i = !false;
        boolean j = !g;
    }
}