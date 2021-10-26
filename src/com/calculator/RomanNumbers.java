package com.calculator;

public class RomanNumbers {
    public static boolean checkingRomanNum (String romNum) {
        boolean checking = true;
        switch (romNum){
            case "I":
                break;
            case "II":
                break;
            case "III":
                break;
            case "IV":
                break;
            case "V":
                break;
            case "VI":
                break;
            case "VII":
                break;
            case "VIII":
                break;
            case "IX":
                break;
            case "X":
                break;
            default:
                checking = false;
        } return checking;
    }
    public static int romanToInt(String romanNum) {
        int result = 0;
        switch (romanNum) {
            case "I":
                result = 1;
                break;
            case "II":
                result = 2;
                break;
            case "III":
                result = 3;
                break;
            case "IV":
                result = 4;
                break;
            case "V":
                result = 5;
                break;
            case "VI":
                result = 6;
                break;
            case "VII":
                result = 7;
                break;
            case "VIII":
                result = 8;
                break;
            case "IX":
                result = 9;
                break;
            case "X":
                result = 10;
                break;
        } return result;
    }
    public static String intToRome(int romanResult) {
        StringBuilder result = new StringBuilder();

        while (romanResult > 0) {
            if ((romanResult/100) >= 1) {
                result.append("C");
                romanResult = romanResult - 100;
            } else if ((romanResult/50) >= 1) {
                result.append("L");
                romanResult = romanResult - 50;
            } else if ((romanResult/10) >= 1) {
                result.append("X");
                romanResult = romanResult - 10;
            } else {
                switch ((romanResult)) {
                    case 9:
                        result.append("IX");
                        romanResult -= 9;
                        break;
                    case 8:
                        result.append("VIII");
                        romanResult -= 8;
                        break;
                    case 7:
                        result.append("VII");
                        romanResult -= 7;
                        break;
                    case 6:
                        result.append("VI");
                        romanResult -= 6;
                        break;
                    case 5:
                        result.append("V");
                        romanResult -= 5;
                        break;
                    case 4:
                        result.append("IV");
                        romanResult -= 4;
                        break;
                    case 3:
                        result.append("III");
                        romanResult -= 3;
                        break;
                    case 2:
                        result.append("II");
                        romanResult -= 2;
                        break;
                    case 1:
                        result.append("I");
                        romanResult -=  1;
                        break;
                }
            }
        }

        if (romanResult < 0) {
            throw new IllegalArgumentException("Wrong Input! Roman numbers cannot be negative");
        }
        return result.toString();
    }
}
