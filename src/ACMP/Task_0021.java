package ACMP;

import java.util.Scanner;

public class Task_0021 {

    private static Scanner scn;
    private static int arr[];

    public static void main(String[] args) {

        init();
        logic();

    }

    public static void init() {
        scn = new Scanner(System.in);
         arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void logic(){
        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(arr[2] - arr[0]);
    }
}