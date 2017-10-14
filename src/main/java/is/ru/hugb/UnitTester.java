package is.ru.hugb;

import static org.junit.Assert.*;

public class UnitTester
{
    public void addTest()
    {
        StringCalculator sc = new StringCalculator();
        assertEquals("Must be 0: ", 0, sc.add(""));
        assertEquals("Must be 1: ", 1, sc.add("1"));
        assertEquals("Must be 3: ", 3, sc.add("1,2"));
    }
}
