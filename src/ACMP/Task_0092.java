package ACMP;

import java.util.Scanner;

public class Task_0092 {

    private static int x;
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        input();
        logic();

    }

    public static void input(){
        x = scn.nextInt();
    }

    public static void logic(){

        //6x = s;
        //s = x/6;
        //x = (s+s)*2;

        int s = x / 6;
        x = (s + s) * 2;
        System.out.println(s + " " + x + " " + s);
    }
}