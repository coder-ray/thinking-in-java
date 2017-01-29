package cn.devlife.c02.exercises;

/**
 * Exercise 5, page 90
 *
 * @author kevin
 */
public class DataOnlyTestPlus {
    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        DataOnly data = new DataOnly();
        data.i = 234;
        data.d = 2.45;
        data.b = true;
        data.show();
    }
}
