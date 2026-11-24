package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void reverseStringHello(){
        assertEquals("olleH", StringUtils.reverseString("Hello"));
    }

    @Test
    public void reverseStringWorld(){
        assertEquals("dlroW", StringUtils.reverseString("World"));
    }

    @Test
    public void reverseStringHelloWorld(){
        assertEquals("dlroW olleH", StringUtils.reverseString("Hello World"));
    }

    @Test
    public void reverseDigits9002(){
        assertEquals("2009", StringUtils.reverseString("9002"));
    }
}
