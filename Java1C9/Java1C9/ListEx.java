import java.util.*;

public class ListEx {
    public static void main (String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(9);
        List<Integer> al2 = Arrays.asList(2, 3, 5, 9);
        //al.add(3.8);
        
        System.out.println(al);
        
        al.remove(2);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        
        for (int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }
        
        for (Integer i : al) {
            System.out.println(i);
        }
        
        al.forEach(s -> System.out.println(s));
        al.forEach(System.out::println);
        
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()) {
            Integer val = it.next();
        }
        
        
        
        
        
        
    }
}