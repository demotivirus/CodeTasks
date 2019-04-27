package ACMP;

import java.util.Scanner;

public class Task_0002 {

    private static long a;
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        input();
        logic();

    }

    public static void input(){
        a = scn.nextLong();
    }

    public static void logic(){

        long sum = 0;

        if(a > 0){
            for (int i = 1; i <= a; i++) {
                sum += i;
            }
            System.out.println(sum);
        }

        else if(a == 0) {
            System.out.println(1);
        }

        //-5, -4, -3...
        else{
            for (int i = 1; i >= a; i--) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}