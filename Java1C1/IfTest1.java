public class IfTest1 {
    public static void main (String[] args) {
        int value = 5;
        
        if (value % 2 == 0) {
            value++;
        } else {
            value--;
        }
        
        
        
        
        if (value % 3 == 0) {
            value += 10;
        } else if (value % 3 == 1) {
            value += 20;
        } else {
            value += 30;
        }
        
        
        /*if (value % 3 == 0) {
           value += 10;
        }
        
        if (value % 3 == 1) {
           value += 20;
        }
        
        if (value % 3 == 2) {
           value += 30;
        }*/
        
        
        System.out.println(value);
    }
}