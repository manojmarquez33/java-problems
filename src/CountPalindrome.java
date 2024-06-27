public class CountPalindrome {
    public static void main(String[] args) {
        System.out.println(countPalin("Madam "
                + "Arora teaches malayalam"));

        System.out.println(countPalin("Nitin "
                + "speaks malayalam"));
    }
    static int countPalin(String sentence){
        sentence= sentence+" ";
        int n = sentence.length();
        int count=0;
        String word="";
        for(int i=0;i<n;i++){
            char c = sentence.charAt(i);
            if(c!=' ') {
                word += c;
            }else{
                if(checkPalindrom(word)) {
                    count++;
                }
                 word = "";
            }
        }
        return count;
    }

    static boolean checkPalindrom(String word){
        int n = word.length();
        word = word.toLowerCase();
        for(int i=0;i<n;i++,n--){
            if(word.charAt(i)!=word.charAt(n-1))
                return false;
        }
        return true;
    }
}
