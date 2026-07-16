package com.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class StringUtilitiesTestNew {
    private StringUtilitiesNew stringUtilities;
    @BeforeEach
    void setUp() {
        stringUtilities = new StringUtilitiesNew();
    }
    @Test
    void testIsPalindrome() {
        assertTrue(stringUtilities.isPalindrome("level"));
        assertTrue(stringUtilities.isPalindrome("racecar"));

        assertFalse(stringUtilities.isPalindrome("hello"));
    }
    @Test
    void testSplitCommaSeparatedLine() {
        List<String> result =
                stringUtilities.splitCommaSeparatedLine("apple,banana,orange");

        assertEquals(
                List.of("apple", "banana", "orange"),
                result
        );
    }
}