import org.junit.jupiter.api.Test;
import playsAndStuff.Palindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @Test
    public void enterNumbers_NumberIsAPalindromeTest(){
        assertTrue(Palindrome.isPalindrome(String.valueOf(12221)));
        assertFalse(Palindrome.isPalindrome(String.valueOf(1678961)));

    }
}
