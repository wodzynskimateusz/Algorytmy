package PracaDomowa2701;

import java.util.Scanner;

public class GeneratorPlanszyWarcaby {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj rozmiar planszy w formacie 'MxN'");
        String[] wymiary = sc.next().split("x");
        int m = Integer.valueOf(wymiary[0]);
        int n = Integer.valueOf(wymiary[1]);
        String[][] plansza = new String[m][n];

        System.out.println("Podaj kolor pola A1 (jedna litera)\nC - czarny\nB - bialy");
        String kolor = sc.next().toUpperCase();

        if (kolor.equals("C") || (kolor.equals("B"))) {
            kolorowanie(plansza, kolor);
            drukowaniePlanszy(plansza);
        } else
            System.out.println("Podales niepoprawne dane dotyczace koloru");
    }

    static void kolorowanie(String[][] array, String kolor) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (kolor.equals("C")) {
                    if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0))
                        array[i][j] = "czarny";
                    else
                        array[i][j] = "bialy";
                } else {
                    if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0))
                        array[i][j] = "bialy";
                    else
                        array[i][j] = "czarny";
                }
            }
        }
    }

    static void drukowaniePlanszy(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.printf("\n");
        }
    }

}
