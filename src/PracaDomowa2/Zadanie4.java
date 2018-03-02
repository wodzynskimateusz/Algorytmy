package PracaDomowa2;

import java.util.ArrayList;
import java.util.Stack;

public class Zadanie4 {
    public static void main(String[] args) {

        String input = "123454321";
        char [] inputArray = input.toCharArray();


        // LISTA
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i <inputArray.length ; i++) {
            lista.add(Character.getNumericValue(inputArray[i]));
        }


        // STOS
        Stack<Integer> stos = new Stack<>();

        int srodek = Math.floorDiv(lista.size(),2);
        int index = 0;

        // pierwsza polowa
        while (index < srodek) {
            stos.add(lista.get(index));
            index++;
        }

        // srodek
        if (lista.size() % 2 != 0){
            index++;
        }

        // druga polowa
       while (index < lista.size()) {
            if (lista.get(index) != stos.pop()){
                System.out.println("Liczba nie jest palindromem.");
                return;
            }
            index++;
        }
        System.out.println("Liczba jest palindromem.");
    }
}
