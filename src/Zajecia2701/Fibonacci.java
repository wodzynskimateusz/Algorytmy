package Zajecia2701;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int n = sc.nextInt();
        System.out.println(ciag(n));
    }

    static int ciag(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return ciag(n - 1) + ciag(n - 2);
    }
}
