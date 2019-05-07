import java.util.*;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(5);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.removeLast();
        list.removeFirst();
        
        list.add(3);
        
        System.out.println(list);
    }
}