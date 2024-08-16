package de.ricardo;

public class Main {
    public static void main(String[] args) {
        double result = add(10,20);
        System.out.println("Result: " + result);

        double resultSub = sub(20, 15);
        System.out.println("ResultSub: " + resultSub);

        int resultPositive = makePositive(5, -28);
        System.out.println("ResultPositive: " + resultPositive);

        double resultAddOrSub = addOrSub(30, 25);
        System.out.println("ResultAddOrSub: " + resultAddOrSub);

        int resultEvenOrDouble = checkEvenOrDouble(13);
        System.out.println("ResultEvenOrDouble: " + resultEvenOrDouble);

        String testStr = "level";
        boolean isPalindrome = isPalindrome(testStr);
        System.out.println("Is Palindrome: " + isPalindrome);

    }

    public static double add (double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static double sub (double a, double b) {
        double sum = a - b;
        return sum;
    }

    public static int makePositive(int a, int b) {
        int sum = a + b;
        if (sum < 0) {
            return -sum;
        } else {
            return sum;
        }
    }

    public static double addOrSub (int a, int b) {
        if (a > b) {
            return sub(a,b);
        } else {
            return add(a,b);
        }
    }

    public static int checkEvenOrDouble(int number) {
        if (number % 2 == 0) {
            return number;
        } else {
            return number * 2;
        }
    }

    public static boolean isPalindrome(String inputStr) {
        StringBuilder reversedStr = new StringBuilder();

        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reversedStr.append(inputStr.charAt(i));
        }

        return inputStr.equals(reversedStr.toString());
    }
}
