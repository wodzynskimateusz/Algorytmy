package PracaDomowa2;

public class Zadanie1wersja2 {
    public static void main(String[] args) {

        //wersja druga zalezna od interpretacji polecenia - zakladamy ze w tablicy znajduja sie tylko liczby >= 0

        int[] input = {5, 1, 12, 1, 48, 4, 8, 45, 1, 5, 7, 16, 14, 7, 50};

        // wyszukuje max
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max)
                max = input[i];
        }

        // tablica zliczen
        int[] counter = new int[max + 1];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = -1;
        }

        //zliczam liczby do pierwszego powtorzenia
        for (int i = 0; i < input.length; i++) {
            if (counter[input[i]] > -1) {
                System.out.printf("Liczba ktora powtorzyla sie jako pierwsza to %d, wystepuje ona na %d i %d miejscu w tablicy.\n",
                        input[i], counter[input[i]], i);
                break;
            }
            counter[input[i]] = i;
            if (i == input.length - 1)
                System.out.println("Zadna z liczb nie powtorzyla sie.");
        }
    }
}
