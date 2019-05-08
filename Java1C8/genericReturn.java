public class genericReturn
{
    public static void main(String[] args)
    {
        //dupa egal merge sa punem si doar <>
        // Catalog<String> c=new Catalog<>();
        //la tipuri generice asteapta un tip de clasa, nu o primitiva
        Catalog<String> c=new Catalog<String>();
        c.setNota("FB");
        
        Catalog<Integer> c1=new Catalog<Integer>();
        c1.setNota(10);
        
        
        //Catalog.m1("Buna");//acelasi lucru cu
        Catalog.<String>m1("Buna");//doar ca aici esti obligat s apui un string, dincolo nu. poti da si un int
        //daca  nu ii dam nimic va fi implicit Object
    
    
    }
}
