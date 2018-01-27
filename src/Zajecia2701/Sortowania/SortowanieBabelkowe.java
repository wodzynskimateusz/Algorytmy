package Zajecia2701.Sortowania;

public class SortowanieBabelkowe {
    public static void main(String[] args) {

        int[] input = {3, 4, 2, 5, 1};

        for (int i = 0; i < input.length; i++)  //idziemy po calej dlugosci tablicy do posortowania
        {
            for (int j = 0; j < input.length - 1; j++)  //za kazdym razem zaczynay od poczatku
            // mamy pewnosc, ze zawsze uda nam sie dobrze posortowac
            {
                if (input[j] > input[j + 1])   // jezeli elementy sa w zlej kolejnosci wykonujemy swap
                {
                    //SWAP - zamiana miejscami dwoch elementow w tablicy
                    int temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;
                }
            }
        }

        for (int i = 0; i < input.length; i++) {
            System.out.printf("%d ", input[i]);
        }
    }
}
