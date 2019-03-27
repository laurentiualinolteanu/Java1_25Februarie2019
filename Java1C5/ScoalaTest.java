public class ScoalaTest{
    public static void main (String[] args) {
        Elev[] elev = new Elev[3];
        elev[0] = new Elev("Ionescu", 10);
        elev[1] = new Elev("Popescu", 10);
        elev[2] = new Elev("Georgescu", 14);
        Scoala scoala = new Scoala("Nr1", "Bucuresti", elev, "Vasilescu");
        
        System.out.println(scoala.nume);
        System.out.println(scoala.adresa);
        System.out.println(scoala.elevi[1].nume);
        
        System.out.println(scoala.getDirector().getNume());
    }
}