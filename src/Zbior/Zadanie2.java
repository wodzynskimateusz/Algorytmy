package Zbior;

public class Zadanie2 {
    public static void main(String[] args) {

        char[] polskieZnaki = {'ą', 'ć', 'ę', 'ł', 'ń', 'ó', 'ś', 'ź', 'ż'};
        char[] polskieZnakiZamiana = {'a', 'c', 'e', 'l', 'n', 'o', 's', 'z', 'z'};

        String input = "Żaba na zielonej łące patrząca w słońce";
        char[] array = input.toLowerCase().toCharArray();

        // usuwam polskie znaki
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < polskieZnaki.length; j++) {
                if (array[i] == polskieZnaki[j]) {
                    array[i] = polskieZnakiZamiana[j];
                    break;
                }
            }
        }

        // zamieniam CamelCase
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                if (counter % 2 == 0) {
                    array[i] = Character.toUpperCase(array[i]);
                }
                counter++;
            }
        }

        // drukuje wiadomosc po zmianach
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
