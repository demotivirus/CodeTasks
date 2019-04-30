package ACMP;

import java.util.Scanner;

public class Task_0033 {

    private static Scanner scn;

    public static void main(String[] args) {

        init();

    }

    public static void init() {
        scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println((b - 1) + " " + (a - 1));
    }
}