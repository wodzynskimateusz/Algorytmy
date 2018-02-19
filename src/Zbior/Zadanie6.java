package Zbior;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = 0;

        System.out.println("Podaj liczbe przypadkow testowych");
        try {
            t = sc.nextInt();
        } catch (
                InputMismatchException ex) {
            System.out.println("Oszukujesz, koniec gry!");
        }
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            System.out.printf("Przypadek testowy %d\n", i + 1);
            System.out.println("Podaj liczbe uczestnikow oraz zuzycie kredy (dwie liczy oddzielone jedna spacja)");

            String input = sc.nextLine();
            String[] inputArray = input.split(" ");
            int n = Integer.parseInt(inputArray[0]);
            double k = Double.parseDouble(inputArray[1]);

            int wynik = 0;

            for (int j = 0; j < n; j++) {
                System.out.printf("Uczestnik %d\n", j + 1);
                System.out.println("Podaj dlugosci wylosowanych odcinkow w cm (trzy liczby oddzielone pojedynczymi spacjami)");
                String input2 = sc.nextLine();
                String[] inputArray2 = input2.split(" ");
                int a = Integer.parseInt(inputArray2[0]);
                int b = Integer.parseInt(inputArray2[1]);
                int c = Integer.parseInt(inputArray2[2]);

                if (warunekIstnieniaTrojkata(a, b, c)) {
                    int zuzycie = (int) (poleTrojkata(a, b, c) * k * 1000);
                    wynik += zuzycie;
                }
            }

            System.out.printf("Przypadek %d, zuzycie kredy: %d g/m2\n", i + 1, wynik);
        }
    }

    public static boolean warunekIstnieniaTrojkata(int a, int b, int c) {
        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > a) {
            max = c;
        }

        if (a + b + c - max > max)
            return true;
        else
            return false;
    }

    public static double poleTrojkata(int a, int b, int c) {
        double p = (a + b + c) / 2;
        double pole = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return pole / 10000;
    }
}
