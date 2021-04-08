package com.hackerrank;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        boolean result = anagrams("aaab", "aaac");
        System.out.println(result);
    }

    public static boolean anagrams(String str1, String str2) {
        int len = 0;
        if (str1.length() != str2.length())
            return false;
        str1 = str1.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        int counter = 1;

        for (int i = 0; i < str1.length(); i++){
            if (map.get(str1.charAt(i)) == null) {
                map.put(str1.charAt(i), counter);
            } else {
                int currentValue = map.get(str1.charAt(i));
                currentValue++;
                map.put(str1.charAt(i), currentValue);
            }
        };

        counter = 1;
        for (int j = 0; j < str2.length(); j++){
            if (map2.get(str2.charAt(j)) == null) {
                map2.put(str2.charAt(j), counter);
            } else {
                int currentValue = map2.get(str2.charAt(j));
                currentValue++;
                map2.put(str2.charAt(j), currentValue);
            }
        };

        for (int m = 0; m < map.size() && m < map.size(); m++) {
            if (map.get)
            if (map.get(str1.charAt(m)) != map2.get(str1.charAt(m))) {
                return false;
            }
        }

        System.out.println(map + " " + map2);

        return true;
    }
};