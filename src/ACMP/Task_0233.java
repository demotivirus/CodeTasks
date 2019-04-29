package ACMP;

import java.util.Scanner;

public class Task_0233 {

    private static Scanner scn;
    private static int[] arr;

    public static void main(String[] args) {

        init();
        logic();

    }

    public static void init(){
        scn = new Scanner(System.in);
        int length = scn.nextInt();
        arr = new int[length];
    }

    public static void logic(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
            if(arr[i] <= 437) {
                System.out.println("Crash " + (i + 1));
                return;
            }
        }
        System.out.println("No crash");
    }
}
