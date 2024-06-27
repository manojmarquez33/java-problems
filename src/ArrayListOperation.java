
import java.util.*;

public class ArrayListOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("After adding elements: " + list);

        // Add element at a specific index
        list.add(1, 10);
        System.out.println("After adding element at index 1: " + list);

        // Add all elements from another collection
        List<Integer> newList = Arrays.asList(4, 5, 6);
        list.addAll(newList);
        System.out.println("After adding all elements from another collection: " + list);

        // Add all elements at a specific index
        List<Integer> anotherList = Arrays.asList(7, 8);
        list.addAll(2, anotherList);
        System.out.println("After adding all elements at index 2: " + list);

        // Check if the list contains an element
        boolean contains = list.contains(10);
        System.out.println("List contains 10: " + contains);

        // Ensure capacity
        list.ensureCapacity(20);
        System.out.println("Ensured capacity of 20.");

        // Get element at a specific index
        int element = list.get(3);
        System.out.println("Element at index 3: " + element);

        // Get index of first occurrence of an element
        int index = list.indexOf(4);
        System.out.println("Index of first occurrence of 4: " + index);

        // Check if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("List is empty: " + isEmpty);

        // Get iterator
        Iterator<Integer> iterator = list.iterator();
        System.out.print("Iterating over list: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Get index of last occurrence of an element
        int lastIndex = list.lastIndexOf(4);
        System.out.println("Index of last occurrence of 4: " + lastIndex);

        // Get list iterator
        ListIterator<Integer> listIterator = list.listIterator();
        System.out.print("List iterator: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        // Get list iterator starting at a specific index
        ListIterator<Integer> listIteratorFromIndex = list.listIterator(2);
        System.out.print("List iterator from index 2: ");
        while (listIteratorFromIndex.hasNext()) {
            System.out.print(listIteratorFromIndex.next() + " ");
        }
        System.out.println();

        // Remove element at a specific index
        list.remove(3);
        System.out.println("After removing element at index 3: " + list);

        // Remove a specific element
        list.remove(Integer.valueOf(4));
        System.out.println("After removing element 4: " + list);

        // Remove all elements from a collection
        list.removeAll(Arrays.asList(7, 8));
        System.out.println("After removing all elements 7 and 8: " + list);

        // Remove elements that match a condition
        list.removeIf(n -> n % 2 == 0);
        System.out.println("After removing elements that are even: " + list);

        // Replace each element with a new value
        list.replaceAll(n -> n * 2);
        System.out.println("After replacing all elements with their double: " + list);

        // Retain only the elements in a specified collection
        list.retainAll(Arrays.asList(2, 6));
        System.out.println("After retaining only 2 and 6: " + list);

        // Set element at a specific index
        list.set(0, 99);
        System.out.println("After setting element at index 0 to 99: " + list);

        // Get the size of the list
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // Sort the list
        list.sort(Comparator.naturalOrder());
        System.out.println("After sorting the list: " + list);

        // Get a sublist of the list
        List<Integer> subList = list.subList(0, 1);
        System.out.println("Sublist from index 0 to 1: " + subList);

        // Convert the list to an array
        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Convert the list to an array of a specific type
        Integer[] intArray = list.toArray(new Integer[0]);
        System.out.println("Integer array: " + Arrays.toString(intArray));

        // Trim the capacity of the list to the current size
        list.trimToSize();
        System.out.println("Trimmed the capacity of the list.");

        // Clear the list
        list.clear();
        System.out.println("After clearing the list: " + list);
    }
}
