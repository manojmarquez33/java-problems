public class Add4todigit {
    public static void main(String[] args) {
        int a = 2875; // 612119
        System.out.println("val "+addDigit(a));
    }
    static int addDigit(int a){
        int res=0;
        int place = 1;
        while(a>0){
            int digit = (a%10)+4; // 9 //11
            if(digit > 9){
                digit = digit %10;
                res+= digit * place;
                place *= 10;
                res+=place;
            } else {
                res += digit * place;
            }
            place *=10;
            a=a/10;
        }

        return res;

    }
}
