class A {
    int base = 2;

    class B implements K {
        @Override
        public int h(int x) {
            int r = 1;
            for (int i = 1; i <= x; i++)
                r *= (base + i);
            return r;
        }

        int h(int x, int y) {
            return h(x) + (y * base);
        }

        class C extends B {
            @Override
            public int h(int x) {
                return super.h(x) - base;
            }
        }
    }
}
