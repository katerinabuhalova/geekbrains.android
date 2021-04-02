package lesson14;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TestMain {

    private Main main;

    @Test
    public void testCheckNumber(){
         main = new Main();
         Assertions.assertTrue(main.checkNumber(new int[]{1, 1, 4, 4}));
     }
}
