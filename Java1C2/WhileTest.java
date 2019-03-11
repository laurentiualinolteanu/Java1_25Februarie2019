public class WhileTest {
    public static void main (String[] args) {
        int a = 1;
        
        while (a <= 10) {
            System.out.println(a);
            a++; //daca comentam linia asta avem bucla infinita
        }
        
        System.out.println("------------------");
        
        a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a < 2);
        
        System.out.println("-------break-----------");
        
        int j = 1;
        
        while (j <= 10) {
            if (j == 3) {
                break;
            }
            System.out.println(j);
            j++;
        }
        
        System.out.println("-------continue-----------");
        
        int k = 1;
        while (k <= 10) {
            if (k == 3) {
                k++;
                continue;
            }
            System.out.println(k);
            k++;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}