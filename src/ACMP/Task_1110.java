package ACMP;

import java.util.Scanner;

public class Task_1110{

        private static Scanner scn;

        public static void main(String[] args) {

            init();
            logic();

        }

        public static void init() {
            scn = new Scanner(System.in);
        }

        public static void logic(){
            long a = scn.nextLong();
            System.out.println(a %= 10);
        }
}