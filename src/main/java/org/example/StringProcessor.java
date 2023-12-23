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
    public double calculateExpression(String expression){
        expression = expression.replaceAll("\\s", "");
        char[] arr = expression.toCharArray(); // make is aray
        int n = 0;
        char lastOperator = '+';
        int result = 0;
        for (char currentChar : arr) {
            if (Character.isDigit(currentChar)) {
                n = n * 10 + (currentChar - '0'); //if number is greater then zero
            } else {
                switch (lastOperator) {
                    case '*':
                        result *= n;
                        break;
                    case '/':
                        result /= n;
                        break;
                    case '+':
                        result += n;
                        break;
                    case '-':
                        result -= n;
                        break;
                    default:
                        break;
                }
                lastOperator = currentChar;

                n = 0;
            }
        }
        switch (lastOperator) {
            case '+':
                result += n;
                break;
            case '-':
                result -= n;
                break;
            case '*':
                result *= n;
                break;
            case '/':
                result /= n;
                break;
            default:
                break;
        }
        return result;
    }



}
