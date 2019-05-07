import java.util.*;

public class VectorTest {
    public static void main (String[] args) {
        Vector<String> v = new Vector<>(2);
        v.addElement("RED");
        v.addElement("ORANGE");
        v.addElement("BLUE");
        v.addElement("GREY");
        v.addElement("BLACK");
        
        System.out.println(v.size());
        System.out.println(v.capacity());
    }
}