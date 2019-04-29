package HackerRank.Java_If_Else;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int weird = scn.nextInt();
        scn.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println((weird%2 == 1 || weird >= 6 && weird <= 20) ? "Weird" : "Not Weird");
    }
}