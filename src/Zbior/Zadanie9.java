package Zbior;

public class Zadanie9 {
    public static void main(String[] args) {

        // podaje nr dowodu
        char[] array = "ABC123456".toCharArray();

        // tabele pomocnicze
        char[] key = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] mnoznik = {7, 3, 1, 9, 7, 3, 1, 7, 3};

        // zliczanie
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < key.length; j++) {
                if (array[i] == key[j]) {
                    sum += (j * mnoznik[i]);
                    break;
                }
            }
        }

        //drukowanie wyniku
        if (sum % 10 == 0)
            System.out.println("Nr dowodu prawidlowy");
        else
            System.out.println("Nieprawidlowy nr dowodu");
    }
}
