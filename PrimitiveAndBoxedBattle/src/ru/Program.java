package ru;

public class Program {
    private static void primitiveTest() {
        int sum = 0;

        for (int i = 0; i < 100; ++i) {
            sum += 1;
        }
    }

    private static void boxedTest() {
        Integer sum = 0;

        for (int i = 0; i < 100; ++i) {
            sum += 1;
        }
    }

    private static void tester() {
        long start = System.nanoTime();
        primitiveTest();
        long finish = System.nanoTime();
        long difference = finish - start;
        System.out.println("Primitive time: " + difference);

        start = System.nanoTime();
        boxedTest();
        finish = System.nanoTime();
        long difference2 = finish - start;
        System.out.println("Boxed time: " + difference2);
        System.out.println("Difference between types: " + (difference2 - difference));
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Test # " + (i + 1));
            tester();
            System.out.println();
        }
    }
}
