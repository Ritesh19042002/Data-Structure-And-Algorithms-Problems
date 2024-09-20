import java.util.Scanner;

public class segregateEvenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int[] ans = new int[n];
        int idx = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                ans[idx] = arr[i];
                idx++;
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                ans[idx] = arr[i];
                idx++;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
