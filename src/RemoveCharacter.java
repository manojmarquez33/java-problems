/**Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).


Example 1:

Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".*/

class RemoveCharacter {
    static String removeChars(String string1, String string2) {
        int count[] = new int[26];
        for (char c : string2.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuffer sb = new StringBuffer();
        for (char ch : string1.toCharArray()) {
            if (count[ch - 'a'] == 0) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String string1 = "computer";
        String string2 = "cat";

        String result = removeChars(string1, string2);

        System.out.println(result);
    }
}
