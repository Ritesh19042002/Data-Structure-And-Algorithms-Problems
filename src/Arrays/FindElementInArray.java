// You are given a number n , representing the size of array a.
//You are given n numbers representing elements of array a.
//You are given another number d.
//You are required to check if d number exist in the array a and at what index(0 based).
//If found print the index otherwise print -1
package Arrays;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                idx=i;
                break;
            }
            }
        System.out.println(idx);
        }
    }



