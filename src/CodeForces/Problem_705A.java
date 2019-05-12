package CodeForces;

import java.util.Scanner;

public class Problem_705A {

    public static void main(String[] args) {

        start();

    }

    public static void start(){
        Scanner scn = new Scanner(System.in);
        logic(scn);
    }

    public static void logic(Scanner scn) {

        String odd = "I hate ";
        String even = "I love ";
        String mid = "that ";
        String end = "it";
        String res = "";

        byte input = scn.nextByte();

        for (int i = 1; i <= input; i++) {
            if(i %2 == 0)
                res += even;
            else res += odd;
            if(i != input)
                res += mid;
            else res += end;
        }

        System.out.println(res);
    }
}