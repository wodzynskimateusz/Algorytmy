package PracaDomowa2;

import java.util.ArrayList;

public class Zadanie2 {
    public static void main(String[] args) {

        String input = "4 [1,2,2,3,4,2,4]";

        int toDelete = Integer.parseInt(input.substring(0,input.indexOf('[')).trim());
        String inputSubstring = input.substring(input.indexOf('[')+1,input.indexOf(']'));
        String[] numbers = inputSubstring.split(",");

        ArrayList<Integer> list = new ArrayList<>();

        // zapisywanie liczb na liscie
        for (int i = 0; i < numbers.length; i++) {
            list.add(Integer.parseInt(numbers[i]));
        }

        // szukanie i usuwanie wartosci toDelete
        int helper = 0;
        while (helper < list.size()){
            if (list.get(helper) == toDelete)
                list.remove(helper);
            else
                helper++;
        }

        // drukowanie listy
        for (Integer values : list) {
            System.out.print(values + " ");
        }

    }
}
