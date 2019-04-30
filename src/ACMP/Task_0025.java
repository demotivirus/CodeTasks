package ACMP;

import java.util.Scanner;

public class Task_0025 {

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
        long b = scn.nextLong();
        if(a > b) System.out.println(">");
        else if(a < b) System.out.println("<");
        else System.out.println("=");
    }
}