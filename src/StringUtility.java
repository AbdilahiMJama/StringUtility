/**
 * This class helps with understanding how the functionality of a string works.
 */

public final class StringUtility {

    /**
     * Creates an instance of String Utility.
     * @author Abdilahi M Jama.
     */
    public StringUtility() { }

    // Returns the reverse value of a string.
    public static String reverse(String word) {
        String reverse = "";
        for (int i = word.length() - 1;i >= 0;  i--) {
            reverse += word.charAt(i);
        }
        return reverse;
        }

    // Checks whether a word is a palindrome.
    public static boolean isPalindrome(String word) {
            return word.equals(reverse(word));
    }

    // Removes a character from the specified index of a word.
    public static String removeCharacter(String word, int index) {
            return word.substring(0, index) + word.substring(index + 1);
    }

    // Checks if two words are anagrams of each other.
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            int index = word2.indexOf(c);
            // If index of any character is -1, then two strings are not anagrams
            // If index of character is not equal to -1, then remove the chacter from the
            // String
            if (index != -1) {
                word2 = removeCharacter(word2, index);
            } else
                return false;
            }
            return word2.isEmpty();
    }

    // Capitalizes a given word.
    public static String capitalize(String word) {
            return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    // Counts the characters in a word
    public static int countCharacter(String word, char character) {
        int index = 0;
        if (index >= word.length()) {
            return 0;
        }
        for (int i = 0; i < word.length(); i++) {
            if (character == word.charAt(i)) {
                index++;
            }
        }
        return index;
    }
}

