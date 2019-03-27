public class Masina {
    private final String culoare;
    private final Marca marca;
    
    public Masina(String culoare, Marca marca) {
        this.culoare = culoare;
        //marca = new Marca(numeMarca);
        //this.marca = marca;
        this.marca = new Marca();
        this.marca.setNume(marca.getNume());
        //marca = new Marca();
        //marca.setNume(numeMarca);
    }
    
    public String getCuloare() {
        return this.culoare;
    }
    
    /*public Marca getMarca() {
        return this.marca;
    }*/
    
    public String getNumeMarca() {
        return this.marca.getNume();
    }
    
}