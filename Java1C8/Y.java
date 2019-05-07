public class Y {
    int a;
    
    class X {
        int b;
        
        public void move() {
            b = 2;
            //X.this.a = 3;
            //this.a = 2;
            //super.a = 2;
            Y.this.a = 4;
            a = 5;
        }
    }
}