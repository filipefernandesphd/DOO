public class Main {
    public static void main(String[] args) {
        Tratador t = new Tratador() {
            public int executar(int x) {
                try {
                    if (x < 0) throw new IllegalArgumentException();
                    int soma = 0;
                    int y = x;
                    while (y > 0) {
                        soma += y;
                        y--;
                    }
                    return soma + (10 / x);
                } catch (ArithmeticException e) {
                    return 0;
                }
            }
        };

        System.out.println(t.executar(10));
        System.out.println(t.executar(0));
        System.out.println(t.executar(-10));
    }
}
