// Search the given element x in array if present then return the index else return -1
//input [1,2,3] x=3 output 2
package Arrays;

import java.util.Scanner;

public class searchIndex {
    void search(){
        // Linear Search

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];

        for(int i = 0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int ans = -1;
        for(int i=0; i< arr.length;i++){
            if(arr[i]==x){
                //ans = arr[i]; if we take arr[i] then print same searched valued.
                  ans = i; // if we take only i then print array index.
                break; // if we use break here then it will not update the value.
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        searchIndex obj = new searchIndex();
        obj.search();
    }
}
