package CodeForces;

import java.util.Scanner;

public class Problem_4A {

    public static void main(String[] args) {

        start();

    }

    public static void start(){
        Scanner scn = new Scanner(System.in);
        logic(scn);
    }

    public static void logic(Scanner scn){

        byte input = scn.nextByte();

        if (input <= 2) System.out.println("NO");
        else if (input %2 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}