import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFreqHashMap {

    public static void sortBasedOnFrequencyAndValue(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }

        Collections.sort(list, (n1, n2) -> {
            int freq1 = map.get(n1);
            int freq2 = map.get(n2);

            if (freq1 != freq2) {
                return freq2 - freq1;
            }

            return n1 - n2;
        });

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
            System.out.print(result[i]+" ");
        }


    }

    public static void main(String[] args) {
        Integer[] arr = { 10, 7, 10, 11, 10, 7, 6, 5 };
        List<Integer> list = Arrays.asList(arr);
        sortBasedOnFrequencyAndValue(list);
    }

}
