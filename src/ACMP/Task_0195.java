package ACMP;

import java.util.Scanner;

public class Task_0195 {

    public static int a, b, c;
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        input();
        logic();

    }

    public static void input(){
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
    }

    public static void logic(){
        int logic = 2 * a * b * c;
        System.out.println(logic);
    }
}
