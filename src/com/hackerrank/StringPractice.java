package com.hackerrank;

public class StringPractice {
    public class Main {
        public void main(String[] args) {
            String A = "hello";
            String B = "java";

            int result = sumOfStrings(A, B);
            System.out.println(result);

            String order = lexograhpicalOrder(A, B);
            System.out.println(order);
            String uppercased = upperCaseFirstChar(A, B);
            System.out.println(uppercased);
        };

        public int sumOfStrings(String A, String B) {
            return A.length() + B.length();
        };

//    LEXICOGRAPHY
//    1. Input two strings string 1 and string 2.
//            2. for (int i = 0; i < str1.length() &&
//            i < str2.length(); i ++)
//            (Loop through each character of both
//    strings comparing them until one
//    of the string terminates):
//    a. If unicode value of both the characters
//    is same then continue;
//    b. If unicode value of character of
//    string 1 and unicode value of string 2
//    is different then return (str1[i]-str2[i])
//            3. if length of string 1 is less than string2
//       return str2[str1.length()]
//            else
//            return str1[str2.length()]

        public String lexograhpicalOrder(String A, String B) {
            int compare = A.compareTo(B);
            String answer = "No";

            if (compare > 0)
                return answer = "Yes";
            return answer;
        };

        public String upperCaseFirstChar(String A, String B) {
            char[] tempStrA = A.toCharArray(), tempStrB = B.toCharArray();
            String a = "", b = "";

            for (int i = 0; i < tempStrA.length || i < tempStrB.length; i++) {
                if (i < tempStrA.length)
                    if (i == 0)
                        a += (Character.toUpperCase(tempStrA[i]));
                    else
                        a += tempStrA[i];

                if (i < tempStrB.length)
                    if (i == 0)
                        b += Character.toUpperCase(tempStrB[i]);
                    else
                        b += tempStrB[i];
            };

            return a + " " + b;
        }
    };
}
