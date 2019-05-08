import java.time.*;

public class LocalDateTimeEx {
    public static void main (String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        ld = ld.plusWeeks(4);
        System.out.println(ld);
        
        LocalDate ld2 = LocalDate.of(2019, 1, 30);
        System.out.println(ld2.plusMonths(1));
        
        
        
        
        
        
        
        
        
    }
}