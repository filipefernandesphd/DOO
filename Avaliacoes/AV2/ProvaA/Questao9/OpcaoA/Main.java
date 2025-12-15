public class Main {
    public static void main(String[] args) {
        Operacao op = new Operacao() {
            public int executar(int x) {
                int s = 0;
                for (int i = 1; i <= x; i+= 2) s += i;
                return s;
            }
        };

        System.out.println(op.executar(10));
    }
}
