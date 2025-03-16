package test;

class DemoClass {
    static void test()
            throws RuntimeException {
        throw new ArithmeticException();
    }

    public static void main(String args[]) {
        try {
            test();
        } catch (RuntimeException re) {

        }
    }
}