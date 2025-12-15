public class Main {
    public static void main(String[] args) {
        Tratador t = new Tratador() {
            public int executar(int x) {
                if (x < 0) throw new IllegalArgumentException();
                int r = x * 2;
                return r + 10;
            }
        };

        System.out.println(t.executar(10));
        System.out.println(t.executar(0));
        System.out.println(t.executar(-10));
    }
}
