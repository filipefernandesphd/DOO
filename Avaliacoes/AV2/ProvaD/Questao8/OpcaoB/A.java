class A {
    static class B {
        double[] calcular(double a, double b, double c) {
            if (a == 0) throw new IllegalArgumentException();
            double delta = (b*b) - (4*a*c);
            if (delta < 0) throw new IllegalArgumentException();
            
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            return new double[]{x1, x2};
        }
    }
}
