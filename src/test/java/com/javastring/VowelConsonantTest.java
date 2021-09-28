package com.javastring;
import org.junit.Assert;
import org.junit.Test;

public class VowelConsonantTest {
    /**
     * This is junit test cases for validating VowelConsonant class using different scenarios
     */
    VowelConsonant vowelConsonant = new VowelConsonant();

    @Test
    public void countNumberOfVowelsAndConsonantInGivenString() {
        int[] expectedCount = new int[]{3, 4};
        int[] actualCount = vowelConsonant.countVowelAndConsonant("surabhi");
        Assert.assertArrayEquals(expectedCount, actualCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void countNumberOfVowelAndConsonantIfNullValueProvided() {
        vowelConsonant.countVowelAndConsonant(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void countNumberOfVowelsAndConsonantIfEmptyValueProvided() {
        vowelConsonant.countVowelAndConsonant("");
    }

    @Test
    public void countVowelsIfSpecialCharacterProvided() {
        int[] expectedCount = new int[]{0, 0};
        int[] totalCount = vowelConsonant.countVowelAndConsonant("@!#$%&");
        Assert.assertEquals(expectedCount, totalCount);
    }
}