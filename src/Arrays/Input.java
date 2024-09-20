package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {

    void multiArrays(){
        int[][] ages = new int[2][2];
        int[][] arr_1 = {{1,1,1},{1,2,3}};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // printing multidimensional array
        System.out.println("------------------------------------------------------------");
        for(int i = 0;i< arr_1.length;i++){
            for(int j =0;j< arr_1[i].length;j++){
                System.out.println(arr_1[i][j]);
            }
        }

        ages[0][0] = 5;
        ages[0][1] = 3;
        ages[1][0] = 4;
//        System.out.println(ages[0][1]);
//        System.out.println(arr_1[1][1]);
    }
    void max(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = new String[3];

        ages[0] = 5;
        ages[1] = 10;
        ages[2] = 15;
//by direct print
        System.out.println("------------------------------------------------------------");
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    //for loop

        System.out.println("------------------------------------------------------------");
        for(int i=0;i<3;i++){
            System.out.println(ages[i]);
        }
    //for each
        System.out.println("------------------------------------------------------------");
        for (int age: ages) {
            System.out.println(age);
        }
    // while loop
        System.out.println("------------------------------------------------------------");
        int i = 0;
        while(i<3){
            System.out.println(ages[i]);
            i++;
        }


        weights[0] = 40.2f;
        weights[1]= 45.4f;
        weights[2] = 50.00f;

        names[0] = "Ritesh";
        names[1] = "Pranav";
        names[2] = "Mohan";

//        System.out.println(ages[1]);
//        System.out.println(weights[2]);
//        System.out.println(names[0]);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input obj = new Input();
        obj.max();
        obj.multiArrays();



    }
}
