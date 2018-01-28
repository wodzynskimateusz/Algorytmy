package Zajecia2701.Sortowania;

import java.util.Scanner;

public class SortowaniePrzezZliczanieKluczWartosci {
    public static void main(String[] args) {

        // CZESC 1: generowanie kluczy i wartosci

        char[] letters = {'A', 'B', 'C'};
        String[] keys = new String[letters.length * letters.length * letters.length];

        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                for (int k = 0; k < letters.length; k++) {
                    sb.append(letters[i]).append(letters[j]).append(letters[k]);
                    keys[counter] = sb.toString();
                    sb.setLength(0);  // czyszczenie StringBuildera
                    counter++;
                }
            }
        }


        // CZESC 2: sortowanie wartosci wprowadzonych przez uzytkownika

        Scanner sc = new Scanner(System.in);
        System.out.println("Ile ciagow podasz?");
        int n = Integer.parseInt(sc.nextLine());   // blad skanera !!!

        String[] toSort = new String[n];

        for (int i = 0; i < n; i++) {
            toSort[i] = sc.nextLine().toUpperCase();
        }

        // zliczanie

        int[] counterArray = new int[27];
        for (int i = 0; i < toSort.length; i++) {
            for (int j = 0; j < keys.length; j++) {
                if (toSort[i].equals(keys[j])) {
                    counterArray[j]++;
                    break;
                }
            }
        }

        // drukowanie posortowanych wartosci

        for (int i = 0; i < counterArray.length; i++) {
            while (counterArray[i] > 0) {
                System.out.print(keys[i] + " ");
                counterArray[i]--;
            }
        }
    }
}
