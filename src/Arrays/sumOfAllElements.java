package Arrays;

import java.util.Scanner;

public class sumOfAllElements {
    void sumOfArray(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];

        for(int i = 0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0;i< arr.length;i++ ){
            ans = ans + arr[i];
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        sumOfAllElements obj = new sumOfAllElements();
        obj.sumOfArray();
    }
}
