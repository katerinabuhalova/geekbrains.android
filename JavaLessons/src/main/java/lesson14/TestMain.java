package lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

public class TestMain {

    private Main main;

    @BeforeEach
    public void init() {
        main = new Main();
    }

    @Test
    public void testCheckArray1() {
        Assertions.assertArrayEquals(new int[]{3, 6}, main.returnNewArray(new int[]{1, 1, 4, 3, 6}));
    }

    @Test
    public void testCheckArray2() {
        Assertions.assertArrayEquals(new int[]{1, 1, 3, 6}, main.returnNewArray(new int[]{4, 1, 1, 3, 6}));
    }

    @Test
    public void testCheckArrayException() {
        Assertions.assertThrows(RuntimeException.class, () -> main.returnNewArray(new int[]{1, 1, 3, 6}));
    }

    @Test
    public void testCheckNumberPositive1() {
        Assertions.assertTrue(main.checkNumber(new int[]{1, 1, 4, 4}));
    }

    @Test
    public void testCheckNumberPositive2() {
        Assertions.assertTrue(main.checkNumber(new int[]{4, 1, 1, 1}));
    }

    @Test
    public void testCheckNumberPositive3() {
        Assertions.assertTrue(main.checkNumber(new int[]{4, 4, 4, 1}));
    }

    @Test
    public void testCheckNumberNegative() {
        Assertions.assertFalse(main.checkNumber(new int[]{1, 1, 1, 1}));
    }
}
