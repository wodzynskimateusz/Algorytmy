package Zbior;

import java.util.Scanner;

public class Czesc2zadanie4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ile zestawow danych podasz?");
        int number = sc.nextInt();
        int[] data = new int[number];
        System.out.println("Podaj dane");

        for (int i = 0; i < data.length ; i++) {
            data[i] = sc.nextInt();
        }

        for (int i = 0; i < data.length ; i++) {
            System.out.println(Math.pow(data[i],2));
        }
    }
}
