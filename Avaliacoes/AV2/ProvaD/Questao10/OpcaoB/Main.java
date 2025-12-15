public class Main {
    public static void main(String[] args) {
        Tratador t = new Tratador() {
            public int executar(int x) {
                if (x < 0) throw new IllegalArgumentException();

                try {
                    int r = 10 / x;
                    int s = 0;
                    while (x > 0) {
                        s += x % 10;
                        x /= 10;
                    }
                    return r + s;
                } catch (ArithmeticException e) {
                    return -1;
                }
            }
        };

        System.out.println(t.executar(10));
        System.out.println(t.executar(0));
        System.out.println(t.executar(-10));
    }
}
