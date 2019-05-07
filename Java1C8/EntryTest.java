public class EntryTest {
    public static void main (String[] args) {
        Entry<String, String> entry = new Entry<>("Mike", "A");
        Entry<String, Integer> entry2 = new Entry<>("Mike", 200);
        
        String value = "ala bala";
        String val = Entry.<String>getMaxMark(value);
        
        Integer intVal = 5;
        Integer intValue = Entry.<Integer>getMaxMark(intVal);
        
        int nr = Entry.<Integer, String>getValue(5, "val");
    }
}