package ACMP;

import java.util.Scanner;

public class Task_1112 {

    private static Scanner scn;

    public static void main(String[] args) {

        init();
        logic();

    }

    public static void init() {
        scn = new Scanner(System.in);
    }

    public static void logic(){
        long a = scn.nextLong();
        byte temp = 0;

        //1..
        temp += a / 100;

        //.2.
        temp += (a / 10) % 10;

        //..3
        temp += a % 10;
        System.out.println(temp);
    }
}