package CodeForces;

import java.util.Scanner;

public class Problem_71A {

    public static void main(String[] args) {

        start();

    }

    public static void start(){
        Scanner scn = new Scanner(System.in);
        logic(scn);
    }

    public static void logic(Scanner scn) {

        int x = scn.nextInt();

        for (int i = 0; i <= x; i++) {

            String word = scn.nextLine();

            if(word.length() > 10){
                int length = word.length();
                //String newWord = word.substring(1, word.length()) + word.length() + word.substring(word.length());
                System.out.println(word.substring(0,1) + (length - 2) + word.substring(length-1));
            }
            else System.out.println(word);
        }
    }
}