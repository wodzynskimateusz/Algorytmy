package Zbior;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj rok");
        int rok = sc.nextInt();

        int a = rok % 19;
        int b = Math.floorDiv(rok, 100);
        int c = rok % 100;
        int d = Math.floorDiv(b, 4);
        int e = b % 4;
        int f = Math.floorDiv((b + 8), 25);
        int g = Math.floorDiv((b - f + 1), 3);
        int h = (19 * a + b - d - g + 15) % 30;
        int i = Math.floorDiv(c, 4);
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = Math.floorDiv(a + 11 * h + 22 * l, 451);
        int p = (h + l - 7 * m + 114) % 31;

        int dzien = p + 1;
        int miesiac = Math.floorDiv((h + l - 7 * m + 114), 31);


        StringBuilder sb = new StringBuilder();
        sb.append("Data Wielkanocy: ").append(dzien);
        if (miesiac == 4)
            sb.append(" kwietnia");
        else
            sb.append(" marca");
        sb.toString();

        System.out.println(sb);
    }
}
