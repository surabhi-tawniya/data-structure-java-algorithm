package com.javastring;
import static org.junit.Assert.*;
import org.junit.Test;

public class StringAlgoTest {
    /**
     * This is junit test cases for validating StringAlgo class using different scenarios
     */
    StringAlgo countVowel = new StringAlgo();

    @Test
    public void countNumberOfVowelsInGivenString() {
        int totalVowel = countVowel.countVowels("surabhi");
        assertEquals(3, totalVowel);
    }

    @Test(expected = IllegalArgumentException.class)
    public void countVowelsIfNullValueProvided() {
        countVowel.countVowels(null);
    }

    @Test
    public void countVowelsIfSpecialCharacterProvided() {
        int totalVowel = countVowel.countVowels("@!#$%&");
        assertEquals(0, totalVowel);
    }

    @Test(expected = IllegalArgumentException.class)
    public void countVowelsIfEmptyValueProvided() {
        countVowel.countVowels("");
    }
}