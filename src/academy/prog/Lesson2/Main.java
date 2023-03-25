package academy.prog.Lesson2;
/**
 *Program that prints primitive data types
 * @author Maksym Rosputko
 * @version 1.0
 */

public class Main {
    /**
     *Start point
     *
     * @param args command line args
     */

    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = -1000000000;
        float f = 1.111f;
        double e = 2.2222222d;
        char g = 'g';
        boolean h = true;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

    }
}
