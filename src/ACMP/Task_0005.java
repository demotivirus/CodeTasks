package ACMP;

import java.util.Scanner;

public class Task_0005 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        int[] arr = new int[length];

        //Fill array and counts
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int rand = scn.nextInt();
            arr[i] = rand;
            if (rand % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println();

        int[] arrEven = new int[evenCount];
        int[] arrOdd = new int[oddCount];

        int countE = 0, countO = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arrEven[countE] = arr[i];
                countE++;
            } else {
                arrOdd[countO] = arr[i];
                countO++;
            }
        }
        for (int i = 0; i < arrOdd.length; i++) {
            System.out.print(arrOdd[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arrEven.length; i++) {
            System.out.print(arrEven[i] + " ");
        }

        System.out.println();

        if (arrEven.length >= arrOdd.length) System.out.println("YES");
        else System.out.println("NO");
    }
}
