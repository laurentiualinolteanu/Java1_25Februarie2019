public class MarcaIndisponibilaException extends Exception {
    public MarcaIndisponibilaException(){
        super("Nu exista un autovehicul disponibil cu marca ceruta");
    }
}