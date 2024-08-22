package com.LearnJava;

public class CompareStringsIgnoringSpecialChars {
        public static void main(String[] args) {
            String str1 = "Hello, World!";
            String str2 = "Hello World";

            boolean areEqual = compareStringsIgnoringSpecialCharacters(str1, str2);
            System.out.println("Are the strings equal? " + areEqual);
        }

        public static boolean compareStringsIgnoringSpecialCharacters(String str1, String str2) {
            // Remove special characters from both strings
            String cleanedStr1 = str1.replaceAll("[^a-zA-Z0-9]", "");
            String cleanedStr2 = str2.replaceAll("[^a-zA-Z0-9]", "");

            // Compare the cleaned strings
            return cleanedStr1.equalsIgnoreCase(cleanedStr2);
        }

}
