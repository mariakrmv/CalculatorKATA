package com.calculator;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] str = input.split(" ");
        String num1 = str[0];
        String num2 = str[2];
        String operation = str[1];

        // проверка кол-ва символов и знака операции
        int quantity = str.length;
        if (quantity != 3 || checkingOperation(operation)) {
            throw new IllegalArgumentException();
        }

        // проверка на арабские числа
        if (num1.matches("\\d+") && num2.matches("\\d+")) {
            int num1Arabic = Integer.parseInt(num1);
            int num2Arabic = Integer.parseInt(num2);

            if ((num1Arabic > 0 && num1Arabic < 11) && (num2Arabic > 0 && num2Arabic < 11)) {
                System.out.println(Operation.doingOperation(num1Arabic, num2Arabic, operation));
            } else {
                throw new IOException("Incorrect numbers");
            }

            // проверка на римские числа
        } else if (RomanNumbers.checkingRomanNum(num1) && RomanNumbers.checkingRomanNum(num2)) {
            int numRoman1 = RomanNumbers.romanToInt(num1);
            int numRoman2 = RomanNumbers.romanToInt(num2);
            int res = Operation.doingOperation(numRoman1, numRoman2, operation);
            if (res > 0) {
                System.out.println(RomanNumbers.intToRome(res));
            } else {
                throw new IOException("Roman numbers cannot be negative");
            }
        } else {
            throw new IOException("Incorrect input");
        }

    }

    public static boolean checkingOperation(String operation) {
        if (operation.equals("/") || operation.equals("*") || operation.equals("+") || operation.equals("-")) {
            return false;
        } else {
            return true;
        }
    }
}
