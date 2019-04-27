package CodeForces;

import java.util.Scanner;

public class Problem_1A {

    public static double a, b, c;
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
        long logic = (long) (Math.ceil(a/c) * Math.ceil(b/c));
        System.out.println(logic);
    }
}