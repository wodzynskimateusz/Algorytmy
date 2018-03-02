package Zbior;

import java.util.Scanner;

public class Czesc2zadanie1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pobieranie danych
        System.out.println("Ile liczb podasz?");
        int iloscLiczb = sc.nextInt();
        int[][] tablicaWynikow = new int[iloscLiczb][2];

        for (int i = 0; i < iloscLiczb; i++) {
            System.out.println("Podaj liczbe nr " + (i + 1));
            tablicaWynikow[i][0] = sc.nextInt();
        }

        // przeliczanie
        for (int i = 0; i < tablicaWynikow.length; i++) {
            int index = 0;
            while (tablicaWynikow[i][0] != palindrom(tablicaWynikow[i][0])) {
                tablicaWynikow[i][0] += palindrom(tablicaWynikow[i][0]);
                index++;
            }
            tablicaWynikow[i][1] = index;
        }

        // drukowanie wynikow
        for (int i = 0; i < tablicaWynikow.length; i++) {
            System.out.printf("%d %d\n", tablicaWynikow[i][0], tablicaWynikow[i][1]);
        }

    }

    public static int palindrom(int liczba) {
        char[] liczbaArray = String.valueOf(liczba).toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = liczbaArray.length - 1; i >= 0; i--) {
            sb.append(String.valueOf(liczbaArray[i]));
        }
        String palindromString = sb.toString();

        int palindrom = Integer.parseInt(palindromString);
        return palindrom;
    }
}
