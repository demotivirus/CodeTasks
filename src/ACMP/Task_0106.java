package ACMP;

import java.util.Scanner;

public class Task_0106 {
    private static int length;
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        input();
        logic();

    }

    public static void input(){
        length = scn.nextInt();
    }

    public static void logic(){
        int count1 = 0, count2 = 0;
        for (int i = 0; i < length; i++) {
            int b = scn.nextInt();
            if(b == 0)
                count1++;
            else count2++;
        }
        System.out.println(count1 > count2 ? count2 : count1);
    }
}