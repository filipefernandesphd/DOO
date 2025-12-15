class A {
    static class B {
        double[] calcular(double a, double b, double c) {
            if (c == 0) throw new IllegalArgumentException();
            double delta = b - 4*a*c;
            double x = -b / (2*a);
            return new double[]{x, x};
        }
    }
}
