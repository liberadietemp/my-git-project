import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {
    private CustomCalculator cal = new CustomCalculator();

    @Test
    public void addTest(){
        int result = cal.add(3,4);
        assertTrue(result == 7);
    }

    @Test
    public void subTest(){
        int result = cal.subtract(10,2);
        assertTrue(result == 8);
    }
    @Test
    public void mulTest(){
        int result = cal.multiply(3,4);
        assertTrue(result == 12);
    }
    @Test
    public void divTest(){
        int result = cal.divide(8,4);
        assertTrue(result == 2);
    }
}