public class MasinaTest {
    public static void main (String[] args) {
        Marca marca = new Marca("VW");
        Masina m1 = new Masina("rosu", marca);
        System.out.println(m1.getCuloare());
        marca.setNume("Audi");
        
        //m1.culoare = "albastru";
        //m1.setCuloare("negru");
        
        //Marca marca = m1.getMarca();
        System.out.println(marca.getNume());
        
        //System.out.println(m1.getMarca().getNume());
        
        //m1.getMarca().setNume("Fiat");
        //System.out.println(m1.getMarca().getNume());
        
        //m1.marca = new Marca("Fiat");
        //m1.setMarca(new Marca("Fiat"));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}