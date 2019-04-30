package ACMP;

import java.util.Scanner;

public class Task_0004 {

    private static Scanner scn;

    public static void main(String[] args) {

        init();
        logic();

    }

    public static void init() {
        scn = new Scanner(System.in);
    }

    public static void logic(){
        int temp = scn.nextInt();
        System.out.println(temp + "9" + (9 - temp));
    }
}