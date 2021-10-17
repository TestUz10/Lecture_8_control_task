import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1Test {

    @Test
    public void test1() {
        assertEquals(144, Task1.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, Task1.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, Task1.findNextSquare(114));
    }
}
