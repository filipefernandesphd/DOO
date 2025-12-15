class A {
    class B {
        double[] calcular(double a, double b, double c) {
            double delta = (b*b) - (4*a*c);
            return new double[]{delta, a};
        }
    }
}
