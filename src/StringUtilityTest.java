import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the string utility class.
 * @author Abdiahi M Jama
 */
public class StringUtilityTest {



    // Tests the reverse method on a string.
    @Test
    void reverseTest() {
        assertEquals("hpesoJ", StringUtility.reverse("Joseph"));
    }

    // Tests if a string is a palindrome.
    @Test
    void isPalindromeTest() {
        assertTrue(StringUtility.isPalindrome("abba"));
    }

    // Tests if a string is an anagram
    @Test
    void isAnagramTest() {
        assertTrue(StringUtility.isAnagram("Abdilahi", "ihalbdAi"));
        assertEquals(false,StringUtility.isAnagram("Abdiilahi","ihalbdAi"));
    }

    // Tests if the first character of a string is capitalized.
    @Test
    void capitalizeTest() {
        assertEquals("Abdi", StringUtility.capitalize("abdi"));

    }

    // Tests if the character count is correct according to the countCharacter method.
    @Test
    void countCharacterTest() {
        assertEquals(3,StringUtility.countCharacter("abaa", 'a'));
    }

    // Tests if the removeCharacter method removes the character at the specified index.
    @Test
    void removeCharacterTest(){
        assertEquals("Jef", StringUtility.removeCharacter("Jeff",3));
    }
}
