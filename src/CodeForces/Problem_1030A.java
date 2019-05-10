package CodeForces;

import java.util.Scanner;

public class Problem_1030A {

    public static void main(String[] args) {

        start();

    }

    public static void start(){
        Scanner scn = new Scanner(System.in);
        logic(scn);
    }

    public static void logic(Scanner scn){

        byte input = scn.nextByte();

        for (int i = 0; i < input; i++) {

            byte a = scn.nextByte();
            if (a == 1) {
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}