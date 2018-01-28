package Zbior;

public class Zadanie8 {
    public static void main(String[] args) {

        String input = "<TItle> To jest tytul </Title>";
        char[] array = input.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '<') {
                for (int j = i; j < array.length; j++) {
                    if (array[j] != '>') {
                        System.out.print(Character.toUpperCase(array[j]));
                    } else {
                        i = j-1;
                        break;
                    }
                }
            } else System.out.print(array[i]);
        }
    }
}
