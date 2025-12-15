public class Main {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();

        int r = c.m(3) + b.m(2, 2);
        System.out.println(r);
    }
}