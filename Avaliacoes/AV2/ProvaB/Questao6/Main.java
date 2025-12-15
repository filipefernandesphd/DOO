public class Main {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();

        int r = b.h(2, 3) + c.h(3);
        System.out.println(r);
    }
}
