public class ProdusTest {
    public static void main (String[] args) {
        Produs p = new Produs();
        //p.nume = "Bere";
        p.setNume("Bere");
        //System.out.println(p.nume);
        System.out.println(p.getNume());
    }
}