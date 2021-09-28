package com.javastring;
import java.util.Arrays;
import java.util.List;

public class StringVowelConsonant {
    /**
     * This is a program for counting the number of vowels and consonants from a string.
     */
    public static void main(String args[]) {
        StringVowelConsonant stringVowelConsonant = new StringVowelConsonant();

        stringVowelConsonant.countVowelAndConsonant("surabhi");
    }
    /**
     * This method is iterating through the string and checking if there are any vowels
     * present in string then count it else count it as consonant
     * @param input
     * @return count
     *
     */
    public int[] countVowelAndConsonant(String input) {
        int[] count = new int[2];
        count[0] = 0;
        count[1] = 0;

        if(input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Please provide valid input");
        }
        for (int i = 0; i < input.length(); i++) {
            List list = Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
            if(list.contains(input.charAt(i))) {
                count[0]++;
            }
            else {
                count[1]++;
            }
        }
        System.out.println("Total number of vowels in a string is : " + count[0]);
        System.out.println("Total number of consonant in a string is : " + count[1]);
        return count;
    }
}
