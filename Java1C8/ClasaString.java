public class ClasaString {
    public static void main(String[] args) {
        String a = "Cluj";
        String b = "Cluj";
        String c = new String("Cluj");
        
        System.out.println(a == b);
        System.out.println(a == c);
        
        System.out.println(a.charAt(2));
        System.out.println(a.compareTo(c));
        
        String d = "CLUJ";
        System.out.println(a.compareToIgnoreCase(d));
        
        a = a.concat(d);
        System.out.println(a);
        
        System.out.println(a.contains("u"));
        
        System.out.println(a.length());
        
        String e = a.substring(2, 6);
        System.out.println(e);
        
        String f = String.valueOf(5);
        
        StringBuilder sb = new StringBuilder(a);
        System.out.println(sb);
        System.out.println(sb.toString());
        System.out.println(sb.delete(2, 3));
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.insert(2, "Sibiu"));
        System.out.println(sb.replace(1, 2, "Mures"));
        System.out.println(sb.reverse());
        sb.setCharAt(3, 'L');
        System.out.println(sb);
        System.out.println(sb.substring(2));
        System.out.println(sb.substring(2, 5));
    }
}