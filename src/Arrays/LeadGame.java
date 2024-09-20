/*
Problem

The game of billiards involves two players knocking 3 balls around on a green baize table. Well,
there is more to it, but for our purposes this is sufficient.The game consists of several rounds and
in each round both players obtain a score, based on how well they played. Once all the rounds have been
played, the total score of each player is determined by adding up the scores in all the rounds and the
player with the higher total score is declared the winner.
The Siruseri Sports Club organises an annual billiards game where the top two players of Siruseri play
against each other. The Manager of Siruseri Sports Club decided to add his own twist to the game by
changing the rules for determining the winner. In his version, at the end of each round, the cumulative
score for each player is calculated, and the leader and her current lead are found. Once all the rounds
are over the player who had the maximum lead at the end of any round in the game is declared the winner.

Consider the following scoresheet for a game with 5 rounds:

Round	Player 1	Player 2
1	    140	        82
2	    89	        134
3	    90	        110
4	    112	        106
5	    88	        90
The total scores of both players, the leader and the lead after each round for this game is given below:

Round	Player 1	Player 2	      Leader	    Lead
1	    140	        82	            Player 1	    58
2	    229	        216	            Player 1	    13
3	    319		    326			    Player 2	    7
4	    431		    432			    Player 2	    1
5	    519		    522			    Player 2	    3

Note that the above table contains the cumulative scores.

The winner of this game is Player 1 as he had the maximum lead (58 at the end of round 1) during the
game.Your task is to help the Manager find the winner and the winning lead. You may assume that the
scores will be such that there will always be a single winner. That is, there are no ties.

Input
The first line of the input will contain a single integer N (N ≤ 10000) indicating the number of
rounds in the game. Lines 2,3,...,N+1 describe the scores of the two players in the N rounds. Line i+1 contains two integer Si and Ti, the scores of the Player 1 and 2 respectively, in round i. You may assume that 1 ≤ Si ≤ 1000 and 1 ≤ Ti ≤ 1000.

Output

Your output must consist of a single line containing two integers W and L, where W is 1 or 2 and
indicates the winner and L is the maximum lead attained by the winner.
Input       Ouput
5		    1 58
140  82
89  134
90  110
112 106
88  90

 */


package Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
public class LeadGame {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ti = new int[n];
        int [] si = new int[n];
        int[] temp1=new int[n];
        int[] temp2=new int[n];
        int[] lead = new int[n];

        for (int i = 0; i <n; i++) {
            ti[i]= sc.nextInt();
            si[i]= sc.nextInt();
            temp1 [0] =   ti[0];
            temp2 [0] =   si[0];
        }
        for (int i = 1; i < n; i++) {
            temp1[i]= ti[i] +temp1[i-1];
            temp2[i]= si[i] +temp2[i-1];

        }


        for (int i = 0; i < n; i++) {
            lead[i] = Math.abs(temp1[i]-temp2[i]);}


        int w = lead[0];
        int l = 0;
        for (int i = 1; i <n ; i++) {

            if( w <lead[i]){
                w = lead[i];
                l = i;
            }


        }



        if(temp1[l]>temp2[l]){
            System.out.println("1 " + w);
        }
        else{
            System.out.println("2 " + w);
        }

    }
}
