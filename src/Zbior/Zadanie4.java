package Zbior;

public class Zadanie4 {
    public static void main(String[] args) {

        String input = "DzisiajJestNiedziela";
        char[] array = input.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i]) && i != 0)
                System.out.print(" " + Character.toLowerCase(array[i]));
            else System.out.print(array[i]);
        }
    }
}
