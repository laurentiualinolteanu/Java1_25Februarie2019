public class ClasaMath {
    public static void main (String[] args) {
        System.out.println(Math.abs(-3));
        System.out.println(Math.sin(Math.PI / 6));
        System.out.println(Math.cos(Math.PI / 3));
        try {
            System.out.println(Math.sqrt(Integer.valueOf("a")));
        } catch (NumberFormatException nfe) {
            System.err.println("Eroare in timpul extragerii radicalului");
            nfe.printStackTrace();
        }
        System.out.println(Math.floor(1.9));
        System.out.println(Math.ceil(1.2));
        System.out.println(Math.random());
    }
}
