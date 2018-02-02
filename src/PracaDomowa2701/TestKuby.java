package PracaDomowa2701;

import java.util.Scanner;

public class TestKuby {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj odpowiedzi uczniow");
        String odpowiedzi = sc.nextLine().toUpperCase();
        String[] tablicaOdpowiedzi = odpowiedzi.split(" ");
        char[] kuba = tablicaOdpowiedzi[0].toCharArray();
        char[] zenek = tablicaOdpowiedzi[1].toCharArray();
        char[] bogdan = tablicaOdpowiedzi[2].toCharArray();

        if (kuba.length == zenek.length && kuba.length == bogdan.length) {
            int counter = 0;
            for (int i = 0; i < kuba.length; i++) {
                if (kuba[i] != zenek[i])
                    counter++;
                if (kuba[i] != bogdan[i])
                    counter++;
            }
            System.out.println(counter);
        } else
            System.out.println("Wprowadziles niepoprawne dane");
    }
}
