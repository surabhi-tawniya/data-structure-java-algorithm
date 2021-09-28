package com.javastring;
import java.util.Arrays;
import java.util.List;

public class StringAlgo {
    /**
     * This is a program for counting the number of vowels from a string.
     */
    public static void main(String args[]) {
        StringAlgo stringAlgo = new StringAlgo();

        stringAlgo.countVowels("Icecream");
    }

    /**
     * This method is iterating through the string and checking if there are vowels present in string then count it
     *
     * @param input
     * @return count
     */
    public int countVowels(String input) {
        int count = 0;
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Please provide valid input");
        }
        for (int i = 0; i < input.length(); i++) {
            List list = Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
            if (list.contains(input.charAt(i))) {
                count++;
            }
        }
        System.out.println("Total number of vowels in a string is : " + count);
        return count;
    }
}