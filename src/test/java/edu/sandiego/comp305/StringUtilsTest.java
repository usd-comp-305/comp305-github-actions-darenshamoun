package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringUtilsTest {

    @Test
    void reverseStringReversesTypicalWord() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }

    @Test
    void reverseStringReversesSentence() {
        assertEquals("dlrow olleh", StringUtils.reverseString("hello world"));
    }

    @Test
    void reverseStringReturnsEmptyWithEmptyInput() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void reverseStringReturnsSingleCharacterSame() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    void reverseStringReversesPalindrome() {
        assertEquals("racecar", StringUtils.reverseString("racecar"));
    }

    @Test
    void reverseStringThrowsOnNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> StringUtils.reverseString(null)
        );
    }
}
