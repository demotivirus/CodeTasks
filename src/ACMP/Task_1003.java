package ACMP;

import java.util.Scanner;

public class Task_1003 {

    private static Scanner scn;

    public static void main(String[] args) {

        init();
        logic();

    }

    public static void init() {
        scn = new Scanner(System.in);
    }

    public static void logic(){
        long a = 3 * scn.nextLong();
        long b = 5 * scn.nextLong();
        long c = 12 * scn.nextLong();
        System.out.println(a + b + c);
    }
}