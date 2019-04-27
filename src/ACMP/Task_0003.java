package ACMP;

import java.util.Scanner;

public class Task_0003 {

    public static long a;
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        input();
        logic();

    }

    public static void input(){
        a = scn.nextInt();
    }

    public static void logic(){
        long logic = (a * a);
        System.out.println(logic);
    }
}