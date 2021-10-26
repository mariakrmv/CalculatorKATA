package com.calculator;

public class Operation {
    public static int doingOperation(int number1, int number2, String operation){
        int result = 0;
        switch (operation) {
            case "+":
                result = (number1 + number2);
                break;
            case "-":
                result = (number1 - number2);
                break;
            case "*":
                result = (number1 * number2);
                break;
            case "/":
                result = (number1 / number2);
                break;
        } return result;
    }
}
