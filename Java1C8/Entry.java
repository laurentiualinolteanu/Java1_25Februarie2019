public class Entry<T, V> {
    T name;
    V mark;
    
    public Entry(T name, V mark) {
        this.name = name;
        this.mark = mark;
    }
    
    public T getName() {
        return this.name;
    }
    
    public void setName(T name) {
        this.name = name;
    }
    
    public V getMark() {
        return this.mark;
    }
    
    public void setMark(V mark) {
        this.mark = mark;
    }
    
    public static <T> T getMaxMark(T val) {
        return val;
    }
    
    public static <T, V> int getValue(T t, V v) {
        if (t instanceof Integer) {
            return ((Integer)t).intValue(); 
        }
        return 10;
    }
}