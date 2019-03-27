public class Scoala extends Institutie {
    Elev[] elevi;
    private Director director;
    
    
    
    public Scoala(String nume, String adresa, Elev[] elevi, String numeDirector) {
        //primul mod
        //super(nume, adresa);
        //this.elevi = elevi;
        
        //al doilea mod
        this.nume = nume;
        super.adresa = adresa;
        this.elevi = elevi;
        this.director = new Director(numeDirector);
    }
    
    public void setDirector(Director director) {
        this.director = director;
    }
    
    public Director getDirector(){
        return this.director;
    }
    
    
    
    
    
    
    
    
    
}