public class SecondLargest {
    public static void main(String[] args) {

        int a[] = {1,4,5,7,9,23,113};
        int max1 = a[0];
        int max2 = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max1) max1 = a[i];
        }

        for(int i=0;i<a.length;i++){
            if(a[i]>max2 && a[i]<max1) max2 = a[i];
        }

        System.out.println(max2);
    }
}
