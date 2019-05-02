package ACMP;

import java.util.Scanner;

public class Task_1113 {

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
        short b = scn.nextShort();

        if(a > b){
            if(a % b == 0) System.out.println(1);
            else System.out.println(a % b);
        }
        else if(a < b){
            if(b % a == 0) System.out.println(1);
            else System.out.println(b % a);
        }
        else System.out.println(1);
    }
}