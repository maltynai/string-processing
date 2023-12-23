package org.example;

public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();

        // Test cases for isStrongPassword
        System.out.println("Test Case 1: " + processor.isStrongPassword("Strong@123"));
        System.out.println("Test Case 2: " + processor.isStrongPassword("WeakPassword"));

        // Test cases for calculateDigits
        System.out.println("Test Case 3: " + processor.calculateDigits("123abc456"));
        System.out.println("Test Case 4: " + processor.calculateDigits("abc"));

        // Test cases for calculateWords
        System.out.println("Test Case 5: " + processor.calculateWords("This is a sentence."));
        System.out.println("Test Case 6: " + processor.calculateWords("abc"));

         // Test cases for calculateExpression
        System.out.println("Test case 7: " + processor.calculateExpression("3 + 5 + 9"));
        System.out.println("Test case 8: " + processor.calculateExpression("10 / 9 + 1"));

    }
}
