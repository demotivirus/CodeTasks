package HackerRank.Java_Stdin_and_Stdout_II;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        Double d = scn.nextDouble();
        scn.nextLine();
        String s = scn.nextLine();
        scn.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}