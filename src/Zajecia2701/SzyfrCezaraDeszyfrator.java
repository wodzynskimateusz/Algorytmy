package Zajecia2701;

import java.util.Scanner;

public class SzyfrCezaraDeszyfrator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] literki = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.printf("Podaj wiadomosc");
        char[] wiadomosc = sc.next().toLowerCase().toCharArray();
        System.out.printf("Podaj liczbe szyfrujaca");
        int szyfr = sc.nextInt();

        for (int k = 0; k < wiadomosc.length; k++) {
            int literka = 0;
            for (int l = 0; l < literki.length; l++) {
                if (wiadomosc[k] == literki[l]) {
                    if (l < szyfr) {
                        literka = (l + 26);
                    } else {
                        literka = l;
                    }
                    break;
                }
            }
            System.out.print(literki[(literka - szyfr)]);
        }
    }
}
