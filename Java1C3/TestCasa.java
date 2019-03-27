public class TestCasa {
    public static void main (String[] args) {
        Casa casa1 = new Casa();
        Casa casa2 = new Casa();
        
        casa1.nrEtaje = 2;
        casa2.nrEtaje = 3;
        
        System.out.println("Casa 1 " + casa1.nrEtaje);
        System.out.println("Casa 2 " + casa2.nrEtaje);
        
        System.out.println(Casa.nrEtaje);
        //System.out.println(Casa.suprafata);
    }
}