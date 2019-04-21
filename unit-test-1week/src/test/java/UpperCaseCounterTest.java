
import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseCounterTest {
    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    @Test
    public void null_check(){
        String str = null;
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result==0);
    }

    @Test
    public void emptyValue_check(){
        String str = "";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
    }
    @Test
    public void Capital_ABC(){
        String str = "ABC";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result :: " + result);
        assertTrue(result == 3);
        assertFalse(result == 2);
    }
    @Test
    public void CapitalAndLetter_ABCdefGHI(){
        String str = "ABCdefGHI";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result ::" + result);
        assertTrue(result == 6);
        assertFalse(result == 5);
    }
}
