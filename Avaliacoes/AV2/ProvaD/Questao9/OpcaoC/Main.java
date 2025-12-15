public class Main {
    public static void main(String[] args) {
        Operacao op = new Operacao() {
            int executar(int x) {
                return x + 1;
            }
        };
   
        System.out.println(op.executar(10));
    }
}
