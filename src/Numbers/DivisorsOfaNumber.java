package Numbers;

import LinkedList.InsertData;

import java.util.*;

import static java.util.Collections.*;

public class DivisorsOfaNumber {

    public static ArrayList<Integer> findDivisors(int a){
        ArrayList<Integer> divisors = new ArrayList<>();

        int sqrtN =(int) Math.sqrt(a);

        for (int i = 1; i < sqrtN; i++) {
            if (a % i == 0){
                divisors.add(i);
            }

            if (i != a/i) divisors.add(a/i);
        }
        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        ArrayList<Integer> divisors = findDivisors(a);
        for (int i : divisors){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
