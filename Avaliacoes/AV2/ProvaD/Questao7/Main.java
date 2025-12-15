public class Main {
    public static void main(String[] args) {
        A.B b = new A.B();
        A.B.C c = new A.B.C();

        int r = b.m(2) + c.m(2) + b.m();
        System.out.println(r);
    }
}
