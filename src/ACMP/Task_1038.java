package ACMP;

import java.util.Scanner;

public class Task_1038 {

    private static Scanner scn;

    public static void main(String[] args) {

        init();
        logic();

    }

    public static void init() {
        scn = new Scanner(System.in);
    }

    public static void logic(){
        long input = scn.nextLong();
        double mm = input/10d;
        int luidors = (int) Math.ceil(mm);
        System.out.println(luidors);
    }
}