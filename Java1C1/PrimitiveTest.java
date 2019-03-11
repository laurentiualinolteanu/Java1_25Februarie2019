public class PrimitiveTest{
    public static void main (String[] args){
        int varsta = 30;
        System.out.println("Varsta este " + varsta);
        
        boolean areSalariu = false;
        System.out.println("Studentul are salariu? " + areSalariu);
        
        double valoare = 500.25;
        float pret = 5.3f;
        
        
        pret = (float)valoare;
        
        char c = '\u0714';
        System.out.println(c);
        
        char d = 70;
        System.out.println(d);
        
        int valA, valE = 5, valF;
        double valB;
        boolean valC;
        char valD;
        
        valA = 1;
        valB = 0.0d;
        valC = true;
        valD = 70;
        
        byte g = (byte)varsta;
        
        
        System.out.println(valA + " " + valB + " " + valC + " " + valD);
    }
}