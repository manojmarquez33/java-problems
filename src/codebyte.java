import java.util.*;

class Codebyte {

    public static List<String> CodingChallenge(String s, String[] words) {
        List<String> result = new ArrayList<>();
        int wordLen = words[0].length(); // Length of each word

        // Create a frequency map for the words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Traverse the string to find the concatenated substring
        for (int i = 0; i <= s.length() - wordLen; i++) {
            String currentWord = s.substring(i, i + wordLen);
            if (wordMap.containsKey(currentWord)) {
                result.add(currentWord);
                wordMap.put(currentWord, wordMap.get(currentWord) - 1);

                // Remove the word from the map if its count reaches zero
                if (wordMap.get(currentWord) == 0) {
                    wordMap.remove(currentWord);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string and word array
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter words separated by commas (e.g., foo,bar):");
        String[] words = sc.nextLine().split(",");

        // Find and print the words in the string
        List<String> output = CodingChallenge(s, words);
        System.out.println("Output: " + output);
    }
}
