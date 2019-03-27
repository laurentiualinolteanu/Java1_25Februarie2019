public class TestCasa2{
    public static void main (String[] args) {
        Casa.nrEtaje = 3;
        
        Casa casa1 = new Casa();
        casa1.nrEtaje = 2;
        
        System.out.println(Casa.nrEtaje);
        
        //Casa.calculeazaPerimetru();
    }
}