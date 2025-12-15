public class Main {
    public static void main(String[] args) {
        Tratador t = new Tratador() {
            public int executar(int x) {
                if (x < 0) throw new ArithmeticException();
                int r = 10 / x;
                return r + x;
            }
        };

        System.out.println(t.executar(10));
        System.out.println(t.executar(0));
        System.out.println(t.executar(-10));
    }
}
