package ACMP;

import java.util.Scanner;

public class Task_0052 {

    private static Scanner scn;
    private static char arr[];

    public static void main(String[] args) {

        init();
        logic();

    }

    public static void init() {
        scn = new Scanner(System.in);

        String num = scn.nextLine();
        arr = num.toCharArray();
    }

    public static void logic(){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i < 3) count1 += Character.getNumericValue(arr[i]);
            else count2 += Character.getNumericValue(arr[i]);
        }
        if(count1 != count2) System.out.println("NO");
        else System.out.println("YES");
    }
}