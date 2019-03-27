public class CarteTest{
    public static void main (String[] args) {
        Nuvela nuvela1 = new Nuvela();
        nuvela1.titluNuvela = "AA";
        nuvela1.autor = "AB";
        
        Roman roman1 = new Roman();
        
        Carte nuvela2 = new Nuvela();
        //nuvela2.titluNuvela = "BA";
        if (nuvela2 instanceof Nuvela) {
            ((Nuvela)nuvela2).titluNuvela = "BA";
        }
        nuvela2.autor = "BB";
        
        Carte roman2 = new Roman();
        
        Carte carte = new Carte();
        //Nuvela carte2 = new Carte();
        //Roman carte3 = new Carte();
        
        Carte[] carti = new Carte[4];
        carti[0] = new Carte();
        carti[1] = new Nuvela();
        carti[2] = new Roman();
        //carti[3] = new Elev("Ionescu", 10);
        
        for (Carte c : carti) {
            if (c instanceof Nuvela) {
                System.out.println(((Nuvela)c).titluNuvela + " " + c.autor);
            } else if (c instanceof Roman) {
                System.out.println(((Roman)c).titluRoman + " " + c.autor);
            } else {
                if (c != null) { 
                    System.out.println(c.autor);
                }
            }
        }
        
        
        
        
    }
}