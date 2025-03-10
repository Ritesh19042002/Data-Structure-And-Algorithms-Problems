/*
CodeChef recently revamped its practice page to make it easier for users to identify the next problems they should solve by introducing some new features:

Recent Contest Problems - contains only problems from the last 2 contests
Separate Un-Attempted, Attempted, and All tabs
Problem Difficulty Rating - the Recommended dropdown menu has various difficulty ranges so that you can attempt the problems most suited to your experience
Popular Topics and Tags
Like most users, Chef didn’t know that he could add problems to a personal to-do list by clicking on the magic '+' symbol on the top-right of each problem page. But once he found out about it, he went crazy and added loads of problems to his to-do list without looking at their difficulty rating.

Chef is a beginner and should ideally try and solve only problems with difficulty rating strictly less than
1000.Given a list of difficulty ratings for problems in the Chef’s to-do list, please help him identify how many of those problems Chef should remove from his to-do list, so that he is only left with problems of difficulty rating less than
1000.

Input Format

The first line of input will contain a single integer T, the number of test cases. Then the testcases follow.
Each testcase consists of 2 lines of input.

The first line of input of each test case contains a single integer N, which is the total number of problems that the Chef has added to his to-do list.

The second line of input of each test case contains N space-separated integers
D1,D2,.....Dn which are the difficulty ratings for each problem in the to-do list.

Output Format

For each test case, output in a single line the number of problems that Chef will have to remove so that all remaining problems have a difficulty rating strictly less than
1000

 */

package Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while(m-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int level = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 1000) {
                    level++;
                }
            }

            System.out.println(level);
        }
    }
}
