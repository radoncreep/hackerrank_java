package com.hackerrank;

public class Palindrome {
    public static void main(String[] args) {
        String result = palindrome("madar");
        System.out.println(result);
    }

    public static String palindrome(String s) {
        String tempStr = "";
        String isPalindrome = "No";

        for (int i = s.length() - 1; i >= 0; i--) {
            tempStr += s.charAt(i);
        };

        if (s.equals(tempStr))
            isPalindrome = "Yes";
        return isPalindrome;
    }
}