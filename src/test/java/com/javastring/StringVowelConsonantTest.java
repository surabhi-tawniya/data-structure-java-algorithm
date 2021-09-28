package com.javastring;
import org.junit.Assert;
import org.junit.Test;

public class StringVowelConsonantTest {
    /**
     * This is junit test cases for validating VowelConsonant class using different scenarios
     */
    StringVowelConsonant stringVowelConsonant = new StringVowelConsonant();

    @Test
    public void countNumberOfVowelsAndConsonantInGivenString() {
        int[] expectedCount = new int[]{3, 4};
        int[] actualCount = stringVowelConsonant.countVowelAndConsonant("surabhi");
        Assert.assertArrayEquals(expectedCount, actualCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void countNumberOfVowelAndConsonantIfNullValueProvided() {
        stringVowelConsonant.countVowelAndConsonant(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void countNumberOfVowelsAndConsonantIfEmptyValueProvided() {
        stringVowelConsonant.countVowelAndConsonant("");
    }

    @Test
    public void countVowelsIfSpecialCharacterProvided() {
        int[] expectedCount = new int[]{0, 0};
        int[] totalCount = stringVowelConsonant.countVowelAndConsonant("@!#$%&");
        Assert.assertEquals(expectedCount, totalCount);
    }
}