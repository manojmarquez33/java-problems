import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {

        int a[] = {1,2,2,3,4,5,5};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<a.length;i++){
            if(!set.contains(a[i])){
                set.add(a[i]);
            } else {
                set.remove(a[i]);
            }
        }

        int b[] = new int[set.size()];
        int i = 0;
        for(int val : set){
            b[i++] = val;
        }

        System.out.println(Arrays.toString(b));
    }
}
