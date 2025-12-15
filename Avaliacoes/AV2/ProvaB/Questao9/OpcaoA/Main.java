public class Main {
    public static void main(String[] args) {
        Operacao op = new Operacao() {
            public int executar() {
                return 1;
            }
        };
        
        System.out.println(op.executar(10));
    }
}
