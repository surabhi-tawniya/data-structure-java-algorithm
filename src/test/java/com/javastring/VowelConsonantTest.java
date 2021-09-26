package com.javastring;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VowelConsonantTest {

    VowelConsonant vowelConsonant = new VowelConsonant();

    @Test
    public void countNumberOfVowelsAndConsonantInGivenString() {
        int[] expectedCount = new int[] {3 , 4};
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
    @Ignore
    public void countVowelsIfSpecialCharacterProvided() {
        int[] totalCount = vowelConsonant.countVowelAndConsonant("@!#$%&");
        Assert.assertEquals(0, totalCount);

    }
}