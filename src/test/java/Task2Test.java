import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task2Test {

    @Test
    public void test1() {
        String[] a = {":)", ":D", ":-}", ":-()"};
        assertEquals(2, Task2.countSmileys(a));
    }

    @Test
    public void test2() {
        String[] a = {":)", "XD", ":0}", "x:-", "):-", "D:"};
        assertEquals(1, Task2.countSmileys(a));
    }

    @Test
    public void test3() {
        String[] a = {":)", ":D", "X-}", "xo)", ":X", ":-3", ":3"};
        assertEquals(2, Task2.countSmileys(a));
    }

    @Test
    public void test4() {
        String[] a = {":)", ":)", "x-]", ":ox", ";-(", ";~(", ":~D"};
        assertEquals(3, Task2.countSmileys(a));
    }
}
