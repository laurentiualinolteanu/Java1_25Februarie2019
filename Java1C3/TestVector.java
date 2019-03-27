public class TestVector {
    public static void main (String[] args) {
        int a[] = new int[5];
        //int b[] = new int[]; NU MERGE
        int c[] = new int[] {1, 2, 3};
        int d[] = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4};
        
        int[] e;
        
        a[0] = 2;
        a[1] = 3;
        a[2] = 4;
        //a[3] = 1;
        a[4] = 7;
        
        //a[5] = 6; IndexOutOfBoundsException
        
        System.out.println(a[3]);
        
        for (int i = 0;  i< 5; i++) {
            System.out.println(a[i]);
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
       
        for (int j : a) {
            System.out.println(j);
        }
        
        int f[][] = new int[2][];
        
        f[0] = new int[3];
        f[1] = new int[2];
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}