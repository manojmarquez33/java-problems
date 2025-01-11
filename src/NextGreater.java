import java.util.Arrays;

public class NextGreater {
    public static void main(String[] args) {

        int a[] = {1,9,7,56,36,91,42};
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            boolean notfound = true;
            int next =  Integer.MAX_VALUE;
            for (int j = i; j < a.length; j++){
                if(a[i] < a[j] && a[j] < next){
                    next = a[j];
                    notfound = false;
                }
            }
            a[i] = notfound ? -1 : next;
        }

        System.out.println(Arrays.toString(a));
    }
}
