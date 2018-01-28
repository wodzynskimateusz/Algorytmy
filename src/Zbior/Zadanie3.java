package Zbior;

public class Zadanie3 {
    public static void main(String[] args) {

        String input = "Dzisiaj jest niedziela";
        char[] array = input.toCharArray();

        // zwiekszam pierwsze litery nowych wyrazow
        StringBuilder sb = new StringBuilder();
        array[0] = Character.toUpperCase(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] == ' ') {
                array[i + 1] = Character.toUpperCase(array[i + 1]);
                sb.setLength(0);
            }
        }

        // drukuje wiadomosc po zmianach
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ')
                System.out.print(array[i]);
            else continue;
        }
    }
}
