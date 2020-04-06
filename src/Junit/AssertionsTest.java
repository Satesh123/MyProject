package Junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void assertionstest(){
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = null;
        String str4 = "xyz";
        String str5 = "xyz";

        int val1= 5;
        int val2 =6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};

        //check that two objects are equal
        assertEquals(str1, str2);

        //check that condition is true
        assertTrue(val1 < val2);

        //check that condition is false
        assertFalse(val1 > val2);

        //check that an object isn't null
        assertNotNull(str1);

        //check that an object is null
        assertNull(str3);

        //check if two object references point to the same object.
        assertSame(str4, str5);

        // check if two object references not point to the same.
        assertNotSame(str1, str3);

        //check whether two arrays are equal to each other.
        assertArrayEquals(expectedArray, resultArray);





    }
}
