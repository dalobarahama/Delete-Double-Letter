package com.example.main;

import java.util.Scanner;

public class Solution {

    private static String alphabetOnly;
    private static String checkedString;
    private static int checkedStringLength;
    private static String doubleLetter;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String k = in.nextLine();

        checkConstraints(k);
        checkDoubleLetter();

        if (checkedString.equals("") && isLengthEven()) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }

    }

    private static void checkConstraints(String stringInput) {
        convertToAlphabetOnly(stringInput);

        checkedString = alphabetOnly;

        if (stringInput.length() >= 50) {
            checkedString = checkedString.substring(0, 50);
        }

        checkedStringLength = checkedString.length();
    }

    private static void convertToAlphabetOnly(String k) {
        char[] chars = k.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                stringBuilder.append(c);
            }
        }

        alphabetOnly = stringBuilder.toString();

    }

    private static void checkDoubleLetter() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < checkedStringLength; i++) {
            for (int j = 0; j < i; j++) {
                if (checkedString.charAt(i) == checkedString.charAt(j)) {
                    doubleLetter = stringBuilder.append(checkedString.charAt(i)).toString();
                }
            }

        }

        deleteDoubleLetter();
    }

    private static void deleteDoubleLetter() {
        for (char c : doubleLetter.toCharArray()) {
            checkedString = checkedString.replace(String.valueOf(c), "");
        }
    }

    private static boolean isLengthEven() {
        return checkedStringLength % 2 == 0;
    }

}
