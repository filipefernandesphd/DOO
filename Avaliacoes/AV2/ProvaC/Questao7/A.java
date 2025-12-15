class A {
    static int v = 3;

    static class B implements I {

        // Sobrecarga
        int m() {
            int r = 0;
            for (int i = 1; i <= v; i++) r += i;
            return r; // soma 1..v
        }

        // Implementação da interface
        @Override
        public int m(int x) {
            int r = 1;
            for (int i = 1; i <= x; i++) {
                r *= (v + i);
            }
            return r;
        }

        static class C extends B {
            @Override
            public int m(int x) {
                return super.m(x) + v;
            }
        }
    }
}
