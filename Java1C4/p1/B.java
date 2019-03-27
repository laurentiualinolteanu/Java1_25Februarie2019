package p1;

public class B {
    public B() {
        System.out.println("p1.B");
        p1.A test = new p1.A();
        test.a = 1;
        test.b = 2;
        test.c = 3;
        //test.d = 4;
    }
}