/**
 * An encoded string (s) is given, and the task is to decode it. The encoding pattern is that the occurrence of the
 * string is given at the starting of the string and each string is enclosed by square brackets.
 *
 * Input: s = 3[b2[ca]]
 * Output: bcacabcacabcaca
 * Explaination: 2[ca] means 'ca' is repeated
 * twice which is 'caca' which concatenated with
 * 'b' becomes 'bcaca'. This string repeated
 * thrice becomes the output.
 * */

public class DecodeString {
    public static void main(String[] args) {

        String a = "3[b2[ca]]";
        stringEncode(a);
    }
    static void stringEncode(String n){
        char a[] = n.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='['){
                while (a[i-1]>0){
                    System.out.print(a[i+1]);
                }
            }
        }
    }
}
