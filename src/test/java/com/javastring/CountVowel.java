package com.javastring;

public class CountVowel {

    public static void main(String args[]) {

        CountVowel countVowel = new CountVowel();
        countVowel.countVowels("Aanand");

    }

    public int countVowels(String input)  {
        int count = 0;
        if(input == null || input.isEmpty()){
            throw new IllegalArgumentException("Please provide valid input");
        }

      //  int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A' || input.charAt(i) == 'e' || input.charAt(i) == 'E'|| input.charAt(i) == 'i'  ||  input.charAt(i) == 'I'|| input.charAt(i) == 'o' || input.charAt(i) == 'O'|| input.charAt(i) == 'u' ||  input.charAt(i) == 'U') {
                count++;
            }
        }
        System.out.println("Total number of vowels in a string is : " + count);
        return count;
    }
}