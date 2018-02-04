package Zajecia0302;

import java.util.HashMap;

public class SlownikZad7 {
    public static void main(String[] args) {

        HashMap<Character, Integer> data = new HashMap<>();
        data.put('A', 1);
        data.put('B', 2);
        data.put('C', 3);
        data.put('D', 4);
        data.put('E', 5);
        data.put('F', 6);
        data.put('G', 7);
        data.put('H', 8);
        data.put('I', 9);
        data.put('K', 10);
        data.put('L', 20);
        data.put('M', 30);
        data.put('N', 40);
        data.put('O', 50);
        data.put('P', 60);
        data.put('Q', 70);
        data.put('R', 80);
        data.put('S', 90);
        data.put('T', 100);
        data.put('V', 200);
        data.put('X', 300);
        data.put('Y', 400);
        data.put('Z', 500);


        char[] array = "miska".toUpperCase().toCharArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += data.get(array[i]);
        }
        System.out.println(sum);

    }
}
