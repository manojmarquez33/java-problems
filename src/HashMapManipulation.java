import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

public class HashMapManipulation {
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);

        // Get a value by key
        int value = map.getOrDefault('a',0);
        System.out.println("Value for key 'a': " + value);

        // Get all keys
        Set<Character> keys = map.keySet();
        System.out.println("Keys: " + keys);

        // Get all values
        Collection<Integer> values = map.values();
        System.out.println("Values: " + values);

        // Check if a key exists
        boolean hasKey = map.containsKey('b');
        System.out.println("Contains key 'b': " + hasKey);

        // Check if a value exists
        boolean hasValue = map.containsValue(3);
        System.out.println("Contains value 3: " + hasValue);

        // Get the size of the map
        int size = map.size();
        System.out.println("Size of the map: " + size);

        // Remove a key-value pair
        int removedValue = map.remove('c');
        System.out.println("Removed value: " + removedValue);

        // Get all keys
        Set<Character> keys1 = map.keySet();
        System.out.println("Keys: " + keys1);

        // Get all values
        Collection<Integer> values1 = map.values();
        System.out.println("Values: " + values1);

        // Clear the map
        map.clear();
        System.out.println("Map is empty: " + map.isEmpty());

        // Add some elements back to the map for summing
        map.put('x', 5);
        map.put('y', 10);
        map.put('z', 15);

        // Calculate the sum of all values
        int sum = 0;
        for (int val : map.values()) {
            sum += val;
        }
        System.out.println("Sum of all values: " + sum);
    }
}
