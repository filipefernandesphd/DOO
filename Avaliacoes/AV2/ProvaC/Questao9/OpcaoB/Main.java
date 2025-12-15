public class Main {
    public static void main(String[] args) {
        Operacao op = new Operacao {
            int executar(int x) {
                int s = 0;
                for (int i = 1; i <= x; i++) if (i % 2 == 1) s += x;
                return s;
            }
        };
        
        System.out.println(op.executar(10));
    }
}