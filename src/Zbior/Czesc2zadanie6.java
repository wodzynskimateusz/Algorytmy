package Zbior;

import java.util.Scanner;

public class Czesc2zadanie6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj dane wejsciowe (4 cyfry z zakresu 1-1000");
        String[] input = sc.nextLine().split(" ");
        int n1 = Integer.parseInt(input[0]);
        int k1 = Integer.parseInt(input[1]);
        int n2 = Integer.parseInt(input[2]);
        int k2 = Integer.parseInt(input[3]);

        int liczbaMiejsc = n1 * k1 + n2 * k2;
        System.out.println("Liczba miejsc w samolocie to: " + liczbaMiejsc);

    }
}
