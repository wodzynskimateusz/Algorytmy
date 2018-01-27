package Zajecia2701;

import java.util.Scanner;

public class SzyfrCezara {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] literki = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.printf("Podaj wiadomosc");
        char[] wiadomosc = sc.next().toLowerCase().toCharArray();
        System.out.printf("Podaj liczbe szyfrujaca");
        int szyfr = sc.nextInt();

        for (int i = 0; i < wiadomosc.length; i++) {
            int literka = 0;
            for (int j = 0; j < literki.length; j++) {
                if (wiadomosc[i] == literki[j]) {
                    literka = j;
                    break;
                }
            }
            System.out.print(literki[(literka + szyfr) % 26]);
        }
    }
}
