package org.example;

public class StringProcessor {
    public boolean isStrongPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).+$");
    }

    public int calculateDigits(String sentence) {
        int digitCount = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount;
    }

    public int calculateWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }



}
