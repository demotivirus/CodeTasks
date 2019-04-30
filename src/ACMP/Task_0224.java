package ACMP;

import java.util.Scanner;

public class Task_0224 {

    private static Scanner scn;
    private static int[] arr;

    public static void main(String[] args) {

        init();
        input();
        logic();
        output();
    }

    public static void init(){
        scn = new Scanner(System.in);
        int length = scn.nextInt();
        arr = new int[length];
    }

    public static void input(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void logic(){
        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //wrong answer in test 10

    public static void output(){
        int temp = 1;
        for (int i = arr.length-1; i > arr.length-4 ; i--) {
            temp *= arr[i];
        }
        System.out.println(temp);
    }
}