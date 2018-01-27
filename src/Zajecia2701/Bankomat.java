package Zajecia2701;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int zl = sc.nextInt();
        int gr = sc.nextInt();

        int[] kwotaZl = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] kwotaGr = {50, 20, 10, 5, 2, 1};
        int[] liczbaMonetZl = new int[kwotaZl.length];
        int[] liczbaMonetGr = new int[kwotaGr.length];
        int licznik = 0;

        liczenieNominalow(licznik, zl, liczbaMonetZl, kwotaZl);
        liczenieNominalow(licznik, gr, liczbaMonetGr, kwotaGr);

        drukowanie(liczbaMonetZl, kwotaZl);
        drukowanie(liczbaMonetGr, kwotaGr);
    }

    public static int[] liczenieNominalow(int i, int kasa, int[] liczbaMonet, int[] kwota) {
        while (kasa > 0) {
            liczbaMonet[i] = Math.floorDiv(kasa, kwota[i]);
            kasa -= (kwota[i] * liczbaMonet[i]);
            i++;
        }
        return liczbaMonet;
    }

    public static void drukowanie(int[] liczbaMonet, int[] kwota) {
        for (int m = 0; m < liczbaMonet.length; m++) {
            if (liczbaMonet[m] != 0)
                System.out.printf("%d x %d gr\n", liczbaMonet[m], kwota[m]);
        }
    }
}
