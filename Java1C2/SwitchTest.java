public class SwitchTest{
    public static void main (String[] args) {
        int a = 5;
        
        /*if (a == 1) {
            System.out.println("PRIMAVARA");
        } else if (a == 2) {
            System.out.println("VARA");
        } else if (a == 3) {
            System.out.println("TOAMNA");
        } else {
            System.out.println("IARNA");
        }*/
        
        switch (a) {
            case 1 : System.out.println("PRIMAVARA");
                     break;
            case 2 : System.out.println("VARA");
                     break;
            default : System.out.println("Nu exista anotimpul");
                     break;
            case 3 : System.out.println("TOAMNA");
                     break;
            case 4 : System.out.println("IARNA");
                     break;
        }
        
        boolean b;
        int c = 2;
        if (a == 5) {
            if (c == 2) {
                b = true;
            } else {
                b = false;
            }
        } else {
            b = false;
        }
        
        b = (a == 5 ? (c == 2 ? true : false) : false);
        
        b = (a == 5 ? true : false) && (c == 2 ? true : false);
        
        
        
        
        
        
        
        
        
        
        
    }
}