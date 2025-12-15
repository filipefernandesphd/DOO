class A {
    int v = 2;

    int m() { return v + 1; }     
    int m(int a) { return a * v; } 

    class B extends A implements I {
        int v = 3;

        @Override
        public int m(int a) {   
            int r = 0;
            for (int i = 1; i <= a; i++) {
                r += (v + i);     
            }
            return r;             
        }

        int m(int a, int b) {     
            return m(a) + super.m(b);
        }

        class C extends B {
            @Override
            public int m(int a) {
                return super.m(a) + v; 
            }
        }
    }
}
