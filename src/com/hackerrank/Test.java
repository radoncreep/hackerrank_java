package com.hackerrank;

public class Test {
    static boolean isAnagram(String str1, String str2) {
        // Complete the function
        int len = 0;
        str1 = str1.toLowerCase();
        for (int i = 0; i < str1.length(); i++){

            int counter = 0;
            while (counter < str1.length()) {
                if (str2.charAt(i) == str1.charAt(counter)) {
                    len++;
                    break;
                }
                counter++;
            }
        }

        return len == str1.length();
    }
}
