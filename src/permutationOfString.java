public class permutationOfString {
    public static void main(String[] args) {

        String s = "ABC";
        int n = s.length();
        permute(s,0,n-1);
    }
    static void permute(String str,int start, int end){

        if(start ==  end){
            System.out.println(str);
        } else {
            for(int i=start;i<=end;i++){
                str = swap(str,start,i);
                permute(str,start+1,end);
                str = swap(str,start,i);
            }
        }
    }

    static String swap(String str,int n1, int n2){
        char c[] = str.toCharArray();

            char temp = c[n1];
            c[n1] = c[n2];
            c[n2] = temp;

        return String.valueOf(c);
     }

}
