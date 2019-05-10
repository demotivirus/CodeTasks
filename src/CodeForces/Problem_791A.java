package CodeForces;

import java.util.Scanner;

public class Problem_791A {

    public static void main(String[] args) {

        start();

    }

    public static void start(){
        Scanner scn = new Scanner(System.in);
        logic(scn);
    }

    public static void logic(Scanner scn) {

        int a = scn.nextInt();
        int b = scn.nextInt();

        for (int i = 1;;) {

            a *= 3;
            b *= 2;

            if (a > b) {
                System.out.println(i);
                return;
            }
            else i++;
        }
    }
}