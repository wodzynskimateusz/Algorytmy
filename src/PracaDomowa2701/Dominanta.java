package PracaDomowa2701;

public class Dominanta {
    public static void main(String[] args) {

        int[] T = {-8, 1, -23, 2, 1, 3, 4, 4, 4, 5, 6, 7, 8};  // tablica w ktorej szukamy dominanty

        // wyszukujemy wartosc min i max tablicy T
        int min = T[0];
        int max = T[0];
        for (int i = 0; i < T.length; i++) {
            if (T[i] < min)
                min = T[i];
            if (T[i] > max)
                max = T[i];
        }

        //tworze tablice wartosci zliczonych L
        int[] L = new int[Math.abs(max - min) + 1];

        //zliczam wartosci
        for (int i = 0; i < T.length; i++) {
            L[T[i] - min]++;
        }

        // szukam wartosci max w tablicy L
        int szukamMax = L[0];
        int index = 0;
        for (int i = 0; i < L.length; i++) {
            if (L[i] > szukamMax) {
                szukamMax = L[i];
                index = i;
            }
        }

        // drukowanie wyniku
        if (szukamMax > 1)
            System.out.printf("Dominanta: %d, wystepuje %d razy", (min + index), szukamMax);
        else
            System.out.println("Zadna z wartosci nie powtarza sie");

    }
}
