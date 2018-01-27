package Zajecia2701;

import java.util.Scanner;

public class SitoEratostenesa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] array = new boolean[n + 1];

        array[0] = false;
        for (int i = 1; i < array.length; i++) {
            array[i] = true;
        }

        for (int a = 2; a < array.length; a++) {
            if (array[a]) {
                for (int b = a + a; b < array.length; b += a)
                    array[b] = false;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i])
                System.out.printf("%d ", i);
        }
    }
}
