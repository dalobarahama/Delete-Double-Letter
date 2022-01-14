package com.example.main;

import java.util.Scanner;

public class Solution {


    private static String alphabet;
    private static String checkedString;
    private static boolean checkDoubleLetter = true;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String k = in.nextLine();

        checkConstraints(k);

        while (checkDoubleLetter) {
            if (checkedString.equals("")) {
                checkDoubleLetter = false;
                checkedString = "Possible";
            } else {
                deleteDoubleLetter();
            }
        }

        System.out.println(checkedString);

    }

    /**
     * CONSTRAINTS
     * K contains between 1 and 50 characters.
     * Each character in K will be a lowercase character ('a'-'z').
     **/
    private static void checkConstraints(String k) {
        convertToAlphabetOnly(k);

        checkedString = alphabet;

        if (k.length() >= 50) {
            checkedString = checkedString.substring(0, 50);
        }

    }

    private static void convertToAlphabetOnly(String k) {
        char[] chars = k.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                stringBuilder.append(c);
            }
        }

        alphabet = stringBuilder.toString();

    }

    private static void deleteDoubleLetter() {
        for (int i = 0; i < checkedString.length() - 1; i++) {
            StringBuilder stringBuilder2 = new StringBuilder();
            if (checkedString.charAt(i) == checkedString.charAt(i + 1)) {
                String doubleLetter = stringBuilder2.append(checkedString.charAt(i)).toString();
                checkedString = checkedString.replace(doubleLetter, "");
            }
        }
    }

}
