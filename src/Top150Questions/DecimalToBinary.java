package Top150Questions;

public class DecimalToBinary {

    public static int conversion(int n){
        int dec = 0;
        int number = n;
        String str = Integer.toString(number);
        for (int i = 1; i <= str.length()*i; i*=2) {
            int d = number % 10;
            if(d == 1){
                dec = dec + i;
            }
            number = number / 10;
        }
        return dec;
    }
    public static void main(String[] args) {
        int n = 1011;
        int value = conversion(n);
        System.out.println(value);
    }
}
