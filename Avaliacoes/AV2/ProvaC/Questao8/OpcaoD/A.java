class A {
    static class B {
        static double[] calcular(double a, double b, double c) {
            double x1 = a + b + c;
            double x2 = a - b - c;
            return new double[]{x1, x2};
        }
    }
}
