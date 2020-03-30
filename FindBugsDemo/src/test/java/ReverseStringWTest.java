import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReverseStringWTest {

    @Test
    public void validString() {

        assertEquals(ReverseStringW.reverseWord("hello how are you"), "olleh woh era uoy ");
    }
    @Test
    public void inValidString() {

        assertEquals(ReverseStringW.reverseWord("hellohowareyou"), "uoyerawoholleh ");
    }
    @Test
    public void nullString() {

        assertEquals(ReverseStringW.reverseWord(null), null);
    }
}