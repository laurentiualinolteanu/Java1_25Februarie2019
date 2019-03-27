public class Casa{
    static int nrEtaje;
    double suprafata;
    
    static {
        nrEtaje = 2;
        //suprafata = 30.0; NU
    }
    
    {
        suprafata = 30.0;
        nrEtaje = 4;
    }
    
    public Casa(){
        
    }
    
    public Casa(double suprafata) {
        this.suprafata = 10;
        nrEtaje = 3;
    }
    
    public static double calculeazaPerimetru() {
        nrEtaje = 2;
        //this.suprafata = 10.0;
        //suprafata = 10.0;
        return 50.0;
    }
    
    public boolean areAsigurare() {
        this.suprafata = 20.0;
        nrEtaje = 1;
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}