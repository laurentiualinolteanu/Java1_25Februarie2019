import java.util.*;

public class TestList {
    public static void main (String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.remove(3);
        
        System.out.println(list);
        
        Iterator<Integer> t = list.iterator();
        while(t.hasNext()) {
            int nr = t.next();
            System.out.println(nr);
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        for (int nr : list) {
            System.out.println(nr);
        }
        
        list.forEach(nr -> System.out.println(nr));
        list.forEach(System.out::println);
        
        list.stream().filter(nr -> nr % 2 == 0).forEach(System.out::println);
    }
}