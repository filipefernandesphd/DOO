public class Main {
    public static void main(String[] args) {
        Tratador t = new Tratador() {
            public int executar(int x) {
                if (x < 0) return -1;
                try {
                    return (10 / x) + x;
                } catch (Exception e) {
                    throw new IllegalArgumentException();
                }
            }
        };

        System.out.println(t.executar(10));
        System.out.println(t.executar(0));
        System.out.println(t.executar(-10));
    }
}
