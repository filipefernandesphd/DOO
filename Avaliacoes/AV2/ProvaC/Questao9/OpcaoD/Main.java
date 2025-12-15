public class Main {
    public static void main(String[] args) {
        Operacao op = new Operacao() {
            public executar(int x) {
                return x * x;
            }
        };

        System.out.println(op.executar(10));
    }
}
