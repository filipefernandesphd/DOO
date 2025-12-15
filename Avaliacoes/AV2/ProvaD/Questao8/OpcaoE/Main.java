public class Main {
    public static void main(String[] args) {
        A.B b = new A.B();

        double[] problema1 = b.calcular(1, -3, 2);
        for (double p : problema1) {
            System.out.println(p);
        }

        double[] problema2 = b.calcular(0, -3, 2);
        for (double p : problema2) {
            System.out.println(p);
        }
    }
}
