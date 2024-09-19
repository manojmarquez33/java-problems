//Given a string str, find the longest palindromic substring in str. Substring of string str: str[ i . . . . j ] where 0 ≤ i ≤ j < len(str). Return the longest palindromic substring of str.
//
//        Palindrome string: A string that reads the same backward. More formally, str is a palindrome if reverse(str) = str. In case of conflict, return the substring which occurs first ( with the least starting index).
//
//        Examples :
//
//        Input: str = "aaaabbaa"
//        Output: aabbaa
//        Explanation: The longest Palindromic substring is "aabbaa".

import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
