public class ThreadEx {
    public static void main (String[] args) {
        System.out.println("A inceput metoda main");
        NumereImpareThread nit = new NumereImpareThread();
        nit.start();
        NumerePareGenerator npg = new NumerePareGenerator();
        npg.generareNumerePare();
        System.out.println("S-a terminat metoda main");
        
        NumereNegativeThread nnt = new NumereNegativeThread();
        Thread t = new Thread(nnt);
        t.start();
    }
}