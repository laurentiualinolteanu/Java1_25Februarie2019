public class VehiculeThread extends Thread {
    @Override
    public void run() {
        CentruDeInchiriere centruDeInchiriere = CentruDeInchiriere.getInstance();
        while(true) {            
            System.out.println("Numar masini existente in baza de date: " + centruDeInchiriere.getNrVehicule());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                System.out.println("Error in thread");
            }
        }
    }
}