/*
Chef decides to solve at least 10 problems every week for 4 weeks.
Given the number of problems he actually solved in each week over weeks as
p1,p2,p3 and p4,output the number of weeks in which Chef met his target.
*/
package Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

public class WeekPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[] arr = new int[n];
        int complete = 0;
        for (int i=0; i<n; i++ ){
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i<n;i++){
            if(arr[i]>=10){
                complete++;
            }
        }
        System.out.println(complete);
    }
}
