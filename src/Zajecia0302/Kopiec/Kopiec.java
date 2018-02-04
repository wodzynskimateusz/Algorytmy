package Zajecia0302.Kopiec;

public class Kopiec {

    private int[] tab = new int[15];
    private int n = 0; // rozmiar biezacy kopca

    void addElementToKopiec(int element) {
        int i = n;                           // ustawiamy indeks i na pozycję wstawianego elementu
        n++;                                 // kopiec będzie zawierał o 1 element więcej
        int j = Math.floorDiv(i - 1, 2);     // obliczamy indeks rodzica
        while (i > 0 && tab[j] < element) {  // sprawdzamy warunek kopca
            tab[i] = tab[j];                 // umieszczamy rodzica na miejscu syna
            i = j;                           // przenosimy się na pozycję ojca
            j = Math.floorDiv(i - 1, 2);     // obliczamy indeks ojca
        }
        tab[i] = element;                    //wstawiamy element do kopca
    }

    int deleteElement() {
        if (n > 0) {
            int root = tab[0];
            n--;                             // kopiec będzie zawierał o 1 element mniej
            int element = tab[n];            // zapamiętujemy ostatni element kopca
            int i = 0;                       // przeszukiwanie drzewa rozpoczynamy od korzenia
            int j = 1;                       // j wskazuje lewego syna
            while (j < n) {
                if (j + 1 < n && tab[j + 1] > tab[j]) {      // szukamy wiekszego syna
                    j = j + 1;
                }
                if (element > tab[j])
                    break;
                tab[i] = tab[j];             // inaczej kopiujemy większego syna do ojca
                i = j;                       // przechodzimy na pozycję większego syna
                j = 2 * j + 1;               // j wskazuje lewego syna
            }
            tab[i] = element;                //umieszczamy element w kopcu
            return root;
        }
        return -1;
    }

    public void rozbieranieKopca() {
        int[] sortedTab = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            sortedTab[i] = deleteElement();
        }
        for (int i = 0; i < sortedTab.length; i++) {
            System.out.println(sortedTab[i]);
        }
    }

    void printAllElements() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d: %d\n", i, tab[i]);
        }
    }


}
