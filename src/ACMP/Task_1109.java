package ACMP;

import java.util.Scanner;

public class Task_1109 {

    private static Scanner scn;

    public static void main(String[] args) {

        init();
        logic();

    }

    public static void init() {
        scn = new Scanner(System.in);
    }

    public static void logic(){
        short a = scn.nextShort();
        System.out.println("The next number for the number " + a + " is " + (a+1) + ".");
        System.out.println("The previous number for the number " + a + " is " + (a-1) + ".");
    }
}