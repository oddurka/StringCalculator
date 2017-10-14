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
        assertEquals("Must be 3: ", 6, sc.add("1,2,3"));
        assertEquals("Must be 3: ", 10, sc.add("1,2,3,4"));
        assertEquals("Must be 3: ", 15, sc.add("1,2,3,4,5"));
        assertEquals("Must be 3: ", 21, sc.add("1,2,3,4,5,6"));
        assertEquals("Must be 3: ", 55, sc.add("1\n2,3\n4,5,6\n7,8,9,10"));
    }
}
