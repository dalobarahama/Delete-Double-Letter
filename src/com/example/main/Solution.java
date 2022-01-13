package com.example.main;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String k = in.nextLine();

        boolean checkDoubleLetter = true;

        char[] chars = k.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                stringBuilder.append(c);
            }
        }

        String a = stringBuilder.toString().toLowerCase();

        if (k.length() >= 50) {
            a = a.substring(0, 50);
        }

        StringBuilder stringBuilder2 = new StringBuilder();
        while (checkDoubleLetter) {
            for (int i = 0; i < a.length() - 1; i++) {
                String newString = null;
                if (a.charAt(i) == a.charAt(i + 1)) {
                    String doubleLetter = stringBuilder2.append(a.charAt(i)).toString();
                    newString = a.replace(doubleLetter, "");

                    System.out.println(newString);
                }
                a = newString;
            }
            if (a.equals("")) {
                checkDoubleLetter = false;
            }
        }


    }

    /**
     * CONSTRAINTS
     * K contains between 1 and 50 characters.
     * Each character in K will be a lowercase character ('a'-'z').
     **/
    private static String checkConstraints(String k) {
        checkContainNumber(k);
        String a = k.toLowerCase();

        if (k.length() >= 50) {
            a = a.substring(0, 50);
        }

        System.out.println(a);
        return a;
    }

    private static String checkContainNumber(String k) {
        char[] chars = k.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                stringBuilder.append(c);
            }
        }

//        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

}
