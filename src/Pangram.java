class Pangram {
    public boolean checkIfPangram(String sentence) {
        int a[] = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                a[c - 'a']++;
            }
        }
        for (int val : a) {
            if (val == 0) {
                return false;
            }
        }
        return true;
    }
}
